package lt.workmanger.manager.dao;

import lt.workmanger.manager.model.Assignment;
import org.springframework.data.repository.CrudRepository;

public interface DaoAssignment extends CrudRepository<Assignment, Long> {
}
