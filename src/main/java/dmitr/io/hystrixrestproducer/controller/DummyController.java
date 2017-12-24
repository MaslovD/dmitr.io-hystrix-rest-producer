package dmitr.io.hystrixrestproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DummyController {
    @GetMapping("/echo/{echo}")
    String greeting(@PathVariable("echo") String echo);
}
