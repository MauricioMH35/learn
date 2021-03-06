package br.com.helloworld.HelloWorld.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Message {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "Hello World!";
    }
}
