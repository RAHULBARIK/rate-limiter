package RateLimiter.ratelimiter.controller;

import RateLimiter.ratelimiter.util.TrackFunctionCall;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimiterRestController {

    @TrackFunctionCall
    @GetMapping("/hello")
    @Operation(summary = "Get a greeting", description = "Returns a simple greeting message")
    public String example() {
        // Your method logic here
        return "Example response";
    }
}
