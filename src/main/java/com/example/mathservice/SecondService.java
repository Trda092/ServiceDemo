package com.example.mathservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class SecondService {
    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name){
        return "Hi, "+name+"\rYour new password is "+ (long) Math.floor(Math.random()*Math.pow(10,10));
    }
}
