package lt.workmanger.manager.controller;

import lt.workmanger.manager.model.Project;
import lt.workmanger.manager.model.Task;
import lt.workmanger.manager.model.Worker;
import lt.workmanger.manager.model.Assignment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetApi extends ApiController{

    @GetMapping("api/workers")
    public List<Worker> getAllWorkers(){
        return repository.getAllWorkers();
    }

    @GetMapping("api/projects")
    public List<Project> getAllProjects(){
        return repository.getAllProjects();
    }

    @GetMapping("api/tasks")
    public List<Task> getAllTasks(){
        return repository.getAllTasks();
    }

    @GetMapping("api/assignments")
    public List<Assignment> getAllWorkersTasks(){
        return repository.getAllAssignments();
    }

}
