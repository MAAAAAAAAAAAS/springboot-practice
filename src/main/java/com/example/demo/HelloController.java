package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Привет, мир!";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Привет, " + name + "!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name, @RequestParam int age) {
        return "Привет, " + name + "! Тебе " + age + " лет.";
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        return "Создан пользователь: " + user.getName() + ", возраст: " + user.getAge();
    }
}