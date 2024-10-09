package com.HelloWorld.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping(path="/")
    public String speakHelloWorld(){
        return "Hello Ahmed";
    }
    @GetMapping(path="/string1")
    public String speakHi() {
        return "HI";
    }

    @GetMapping(path="/string2")
    public String speakWow() {
        return "Wow";
    }
}
