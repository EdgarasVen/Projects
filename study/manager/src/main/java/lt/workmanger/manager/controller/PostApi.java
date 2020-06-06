package lt.workmanger.manager.controller;

import lt.workmanger.manager.model.Assignment;
import lt.workmanger.manager.transfer.ProjectTransferOb;
import lt.workmanger.manager.transfer.TaskTransferOb;
import lt.workmanger.manager.transfer.WorkerTransferOb;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostApi extends ApiController{

    @PostMapping("api/workers")
    public void addWorker(@RequestBody final WorkerTransferOb newWorker){
        repositoryService.addWorker(newWorker.build());
    }

    @PostMapping("api/projects")
    public void addProject(@RequestBody final ProjectTransferOb newProject){
        repositoryService.addProject(newProject.build());
    }

    @PostMapping("api/tasks")
    public void addTask(@RequestBody final TaskTransferOb newTask){
        repositoryService.addTask(newTask.build());
    }

    @PostMapping("api/assignment/{workerId}/{taskId}")
    public void addAssignmentToWorker(@PathVariable Long workerId,
                                      @PathVariable Long taskId) {
        repositoryService.addAssignment(new Assignment(
                repositoryService.getWorker(workerId),
                repositoryService.getTask(taskId)
        ));
    }
}
