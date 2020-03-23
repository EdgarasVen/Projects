package lt.workmanger.manager.controller;

import lt.workmanger.manager.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

abstract public class ApiController {
    @Autowired
    public Repository repository;

}
