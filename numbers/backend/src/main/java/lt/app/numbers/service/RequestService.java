package lt.app.numbers.service;

import lt.app.numbers.model.Request;

import java.util.List;

/**
 * Service interface.
 *
 * @author Edgaras Venzlauskas
 * @version 1.0
 */

public interface RequestService {

    Request checkAndSaveNumbers (Request request);
    List<Request> getAllRequests();
}
