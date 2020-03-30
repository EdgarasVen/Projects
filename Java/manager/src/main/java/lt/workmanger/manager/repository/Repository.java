package lt.workmanger.manager.repository;

import lt.workmanger.manager.model.Project;
import lt.workmanger.manager.model.Task;
import lt.workmanger.manager.model.Worker;
import lt.workmanger.manager.model.Assignment;

import java.util.List;

public interface Repository {

    void addWorker(Worker worker);
    void addTask(Task task);
    void addProject(Project project);
    void addAssignment(Assignment assignment);

    List<Worker> getAllWorkers();
    List<Task> getAllTasks();
    List<Project> getAllProjects();
    List<Assignment> getAllAssignments();

    List<Worker> getAllWorkersByProjectId(Long id);

    Worker getWorker(Long id);
    Project getProject(Long id);
    Task getTask(Long id);
    Assignment getAssignment(Long no);

    void deleteProjectById(Long id);
    void deleteTaskById(Long id);
    void deleteWorkerById(Long id);
    void deleteAssignmentByNo(Long no);

    void setWorkerOnProject(Long workerId, Long projectId);
    void unsetWorkerFromProject(Long workerId, Long projectId);
    void addHoursToAssignment(Long no, Long hours);
}
