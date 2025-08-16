package com.git_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class GitDemoApplication {


    @GetMapping("/message/{name}")
    public String getMessage(@PathVariable  String name) {
        return "Welcome to git tutorial " + name+"It will be fun";
    }

    public void addCode() {
        System.out.println("This is a new method added to the code");
    }

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

}
