package lt.weatherapp.weatherapp.rest;

import lt.weatherapp.weatherapp.service.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 *  Class represent api controller for restful application.
 *  Includes GET POST DELETE PUT methods
 *
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/api/v1/")
public class RestApiControllerV1 {
    private final Repository repository;

    @Autowired
    public RestApiControllerV1(Repository repository) {
        this.repository = repository;
    }

    /**
     * GET method to get realtime weather
     * @return Weather object
     */
    @GetMapping("weather")
    public ResponseEntity<Map<Object, Object>> getRealtimeWeather(){
        Map<Object, Object> response = new HashMap<>();
        response.put("weather",repository.getRealTimeWeather());
        return ResponseEntity.ok(response);
    }

    /**
     * GET method to get list of all data.
     * @return List
     */
    @GetMapping("history")
    public ResponseEntity<Map<Object, Object>> getAllHistoryWeather(){
        Map<Object, Object> response = new HashMap<>();
        response.put("weather",repository.getAllWeather());
        return ResponseEntity.ok(response);
    }
}
