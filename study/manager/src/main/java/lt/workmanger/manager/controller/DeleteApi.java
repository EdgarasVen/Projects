package lt.workmanger.manager.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteApi extends ApiController {

    @DeleteMapping("/api/workers/{id}")
    public void deleteWorker(@PathVariable final Long id){
        repositoryService.deleteWorkerById(id); }

    @DeleteMapping("/api/tasks/{id}")
    public void deleteTask(@PathVariable final Long id){
        repositoryService.deleteTaskById(id);
    }

    @DeleteMapping("/api/projects/{id}")
    public void deleteProject(@PathVariable final Long id){
        repositoryService.deleteProjectById(id);
    }

    @DeleteMapping("/api/assignments/{no}")
    public void deleteAssignment(@PathVariable final Long no){
        repositoryService.deleteAssignmentByNo(no);
    }

}
