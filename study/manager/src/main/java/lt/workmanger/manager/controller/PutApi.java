package lt.workmanger.manager.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutApi extends ApiController {

    @PutMapping("api/workers/set/{workerId}/{projectId}")
    public void setWorkerOnProject(@PathVariable Long workerId,
                                   @PathVariable Long projectId){
        repositoryService.setWorkerOnProject(workerId,projectId);

    }

    @PutMapping("api/workers/unset/{workerId}/{projectId}")
    public void unsetWorkerFromProject(@PathVariable Long workerId,
                                       @PathVariable Long projectId){
        repositoryService.unsetWorkerFromProject(workerId,projectId);
    }

    @PutMapping("api/assignment/{no}/{hours}")
    public void addHoursToAssignment(@PathVariable Long no,
                                     @PathVariable Long hours){
        repositoryService.addHoursToAssignment(no,hours);
    }
}
