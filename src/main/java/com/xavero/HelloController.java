package com.xavero;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @GetMapping(path = "/say/{name}")
    @ResponseBody
    public String say(@PathVariable String name) {
        return "Hello " + name + " this is my new method";
    }

    @PostMapping(path = "/say")
    @ResponseBody
    public String sayPost(@RequestParam String name) {
        return "This is my result: " + name;
    }

}
