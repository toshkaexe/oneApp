package tron.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Person {
    @GetMapping("/data")
    public String getPerson(){

        return "test person";
    }
}
