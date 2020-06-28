package lt.app.numbers.service;

import lombok.extern.slf4j.Slf4j;
import lt.app.numbers.model.Request;
import lt.app.numbers.repo.RepoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Request service implementation.
 *
 * @author Edgaras Venzlauskas
 * @version 1.0
 */

@Slf4j
@Service
public class RequestServiceImp implements RequestService{

    private final RepoRequest repoRequest;

    @Autowired
    public RequestServiceImp(RepoRequest repoRequest) {
        this.repoRequest = repoRequest;
    }

    /**
     * Checks how many steps need for win and saves data to database.
     * @param request class
     * @return request class
     */
    @Override
    public Request checkAndSaveNumbers(Request request) {
        NumberChecker checker= new NumberChecker();
        List<Integer> numbers = request.getNumbersList();
        checker.check(numbers,0);
        request.setPathSteps(checker.getCount());
        request.setWinnable(checker.getWinnable());
        repoRequest.save(request);
        log.info("IN checkAndSaveNumbers - saves request ");
        return request;
    }

    /**
     *
     * @return List of requests
     */
    @Override
    public List<Request> getAllRequests() {
        List<Request> list = repoRequest.findAll();
        log.info("IN getAllRequests - list size : {}", list.size());
        return list;
    }
}
