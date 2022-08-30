package com.example.mathservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstService {
    @RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.GET)
    public double add(@PathVariable("num1") double n1, @PathVariable("num2") double n2){
        return n1+n2;
    }

    @RequestMapping(value = "/minus/{num1}/{num2}", method = RequestMethod.GET)
    public double minus(@PathVariable("num1") double n1, @PathVariable("num2") double n2){
        return n1-n2;
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public double multiply(@RequestParam("num1") double n1, @RequestParam("num2") double n2){
        return n1*n2;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public double divide(@RequestParam("num1") double n1, @RequestParam("num2") double n2){
        return n1/n2;
    }
}
