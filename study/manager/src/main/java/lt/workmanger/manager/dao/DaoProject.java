package lt.workmanger.manager.dao;

import lt.workmanger.manager.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface DaoProject extends CrudRepository<Project, Long> {
}
