package lt.workmanger.manager.dao;

import lt.workmanger.manager.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface DaoTask extends CrudRepository<Task, Long> {
}
