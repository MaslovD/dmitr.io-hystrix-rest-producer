package dmitr.io.hystrixrestproducer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerImpl implements DummyController {
    @Override
    public String greeting(@PathVariable("echo") String echo) {
        return String.format("Echo %s!\n", echo);
    }
}
