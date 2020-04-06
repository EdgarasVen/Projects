package lt.workmanger.manager.controller;

import lt.workmanger.manager.model.Project;
import lt.workmanger.manager.model.Task;
import lt.workmanger.manager.model.Worker;
import lt.workmanger.manager.model.Assignment;
import lt.workmanger.manager.security.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class GetApi extends ApiController{

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticate() {
        //throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        return new AuthenticationBean("You are authenticated");
    }

    @GetMapping("api/workers")
    public List<Worker> getAllWorkers(){
        return repositoryService.getAllWorkers();
    }

    @GetMapping("api/projects")
    public List<Project> getAllProjects(){
        return repositoryService.getAllProjects();
    }

    @GetMapping("api/tasks")
    public List<Task> getAllTasks(){
        return repositoryService.getAllTasks();
    }

    @GetMapping("api/assignments")
    public List<Assignment> getAllWorkersTasks(){
        return repositoryService.getAllAssignments();
    }

    @GetMapping("api/workers/{id}")
    public Worker getWorkerById(@PathVariable Long id){
        return repositoryService.getWorker(id);
    }

    @GetMapping("api/projects/{id}")
    public Project getProjectById(@PathVariable Long id){
        return repositoryService.getProject(id);
    }

    @GetMapping("api/assignments/{no}")
    public Assignment getAssignmentById(@PathVariable Long no){
        return repositoryService.getAssignment(no);
    }

    @GetMapping("api/tasks/{id}")
    public Task getTaskById(@PathVariable Long id){
        return repositoryService.getTask(id);
    }

    @GetMapping("api/projects/{id}/workers/")
    public List<Worker> getAllWorkersByProjectId (@PathVariable Long id){
        return repositoryService.getAllWorkersByProjectId(id);
    }
}
