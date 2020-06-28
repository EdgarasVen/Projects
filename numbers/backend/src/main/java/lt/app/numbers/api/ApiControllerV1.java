package lt.app.numbers.api;

import lt.app.numbers.dto.RequestDto;
import lt.app.numbers.model.Request;
import lt.app.numbers.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Base class with property 'id'.
 * Used as a base class for all objects that requires this property.
 *
 * @author Edgaras Venzlauskas
 * @version 1.0
 */

@RestController
public class ApiControllerV1 {
    private final RequestService requestService;

    @Autowired
    public ApiControllerV1(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("api/check")
    public ResponseEntity<Map<Object,Object>> checkNumbers (
            @RequestBody final RequestDto request
            ){
        Request newRequest = new Request();
        newRequest.setCreated(new Date());
        newRequest.setNumbers(request.createNumbers());
        Request responseRequest =requestService.checkAndSaveNumbers(newRequest);
        Map<Object, Object> response = new HashMap<>();
        response.put("request",responseRequest);
        response.put("winnable",responseRequest.getWinnable());
        return ResponseEntity.ok(response);
    }

    @GetMapping("api/requests")
    public ResponseEntity<Map<Object,Object>> getAllRequests(){
        List<Request> list = requestService.getAllRequests();
        Map<Object, Object> response = new HashMap<>();
        response.put("requests",list);
        response.put("size",list.size());
        return ResponseEntity.ok(response);
    }

}
