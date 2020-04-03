package lt.workmanger.manager.controller;

import lt.workmanger.manager.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;

abstract public class ApiController {
    @Autowired
    public RepositoryService repositoryService;

}
