package com.test.codepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/satHello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello "+name;
    }

    @GetMapping("/")
        public String root() {
            return "이 빗속을 걸어갈까요? 둘이서 말 없이 갈까요?222";
        }
}
