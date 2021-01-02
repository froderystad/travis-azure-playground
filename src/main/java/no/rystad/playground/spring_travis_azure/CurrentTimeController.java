package no.rystad.playground.spring_travis_azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class CurrentTimeController {
    @GetMapping("/now")
    public String currentTime() {
        return Instant.now().toString();
    }
}
