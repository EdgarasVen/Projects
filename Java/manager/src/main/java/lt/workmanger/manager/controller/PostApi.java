package lt.workmanger.manager.controller;

import lt.workmanger.manager.model.Assignment;
import lt.workmanger.manager.service.CreateProject;
import lt.workmanger.manager.service.CreateTask;
import lt.workmanger.manager.service.CreateWorker;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostApi extends ApiController{

    @PostMapping("api/workers")
    public void addWorker(@RequestBody final CreateWorker newWorker){
        repository.addWorker(newWorker.build());
    }

    @PostMapping("api/projects")
    public void addProject(@RequestBody final CreateProject newProject){
        repository.addProject(newProject.build());
    }

    @PostMapping("api/tasks")
    public void addTask(@RequestBody final CreateTask newTask){
        repository.addTask(newTask.build());
    }

    @PostMapping("api/assignment/{workerId}/{taskId}")
    public void addAssignmentToWorker(@PathVariable Long workerId,
                                      @PathVariable Long taskId) {
        repository.addAssignment(new Assignment(
                repository.getWorker(workerId),
                repository.getTask(taskId)
        ));
    }
}
