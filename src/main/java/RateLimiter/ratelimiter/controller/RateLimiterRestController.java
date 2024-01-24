package RateLimiter.ratelimiter.controller;

import RateLimiter.ratelimiter.util.TrackFunctionCall;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimiterRestController {

    @TrackFunctionCall
    @GetMapping("/hello")
    public String example() {
        // Your method logic here
        return "Example response";
    }
}
