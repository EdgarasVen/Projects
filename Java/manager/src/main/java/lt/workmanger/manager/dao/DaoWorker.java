package lt.workmanger.manager.dao;

import lt.workmanger.manager.model.Worker;
import org.springframework.data.repository.CrudRepository;

public interface DaoWorker extends CrudRepository<Worker, Long> {
}
