package org.movie.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	Greeter greeter;

    @RequestMapping("/")
    public String greeter() {
        return greeter.getGreeting() + " World!";
    }
}
