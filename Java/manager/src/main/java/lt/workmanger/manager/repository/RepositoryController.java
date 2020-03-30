package lt.workmanger.manager.repository;

import lt.workmanger.manager.dao.*;
import lt.workmanger.manager.model.*;
import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryController implements Repository{

    @Autowired
    DaoWorker workers;
    @Autowired
    DaoTask tasks;
    @Autowired
    DaoProject projects;
    @Autowired
    DaoAssignment assignments;

    @Override
    public List<Worker> getAllWorkers() {
        return (List<Worker>) workers.findAll();
    }

    @Override
    public List<Task> getAllTasks() {
        return (List<Task>) tasks.findAll();
    }

    @Override
    public List<Project> getAllProjects() {
        return (List<Project>) projects.findAll();
    }

    @Override
    public List<Assignment> getAllAssignments() {
        return (List<Assignment>) assignments.findAll();
    }

    @Override
    public List<Worker> getAllWorkersByProjectId(Long id) {
        return projects.findById(id).orElseThrow(null).getWorkers();
    }

    @Override
    public Worker getWorker(Long id) {
        return workers.findById(id).orElseThrow(null);
    }

    @Override
    public Project getProject(Long id) {
        return projects.findById(id).orElseThrow(null);
    }

    @Override
    public Task getTask(Long id) {
        return tasks.findById(id).orElseThrow(null);
    }

    @Override
    public Assignment getAssignment(Long no) {
        return assignments.findById(no).orElseThrow(null);
    }

    @Override
    public void addWorker(Worker worker) {
        workers.save(worker);
    }

    @Override
    public void addTask(Task task) {
        tasks.save(task);
    }

    @Override
    public void addProject(Project project) {
        projects.save(project);
    }

    @Override
    public void addAssignment(Assignment assignment) {
        assignments.save(assignment);
    }

    @Override
    public void deleteProjectById(Long id) {
        projects.deleteById(id);
    }

    @Override
    public void deleteTaskById(Long id) {
        tasks.deleteById(id);
    }

    @Override
    public void deleteWorkerById(Long id) {
        workers.deleteById(id);
    }

    @Override
    public void deleteAssignmentByNo(Long no) {
        assignments.deleteById(no);
    }

    @Override
    public void setWorkerOnProject(Long workerId, Long projectId) {
       Worker worker= workers.findById(workerId).orElseThrow(OBJECT_NOT_EXIST::new);
       worker.getProjects().add(projects.findById(projectId).orElseThrow(OBJECT_NOT_EXIST::new));
       workers.save(worker);
    }

    @Override
    public void unsetWorkerFromProject(Long workerId, Long projectId) {
        Worker worker= workers.findById(workerId).orElseThrow(OBJECT_NOT_EXIST::new);
        worker.getProjects().remove(projects.findById(projectId).orElseThrow(OBJECT_NOT_EXIST::new));
        workers.save(worker);
    }

    @Override
    public void addHoursToAssignment(Long no, Long hours) {
        Assignment assignment=assignments.findById(no).orElseThrow(OBJECT_NOT_EXIST::new);
        assignment.addHours(hours);
        assignments.save(assignment);
    }
}
