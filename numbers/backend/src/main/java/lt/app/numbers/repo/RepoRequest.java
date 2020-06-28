package lt.app.numbers.repo;

import lt.app.numbers.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Request jpa repository interface.
 *
 * @author Edgaras Venzlauskas
 * @version 1.0
 */

public interface RepoRequest extends JpaRepository<Request,Long> {
}
