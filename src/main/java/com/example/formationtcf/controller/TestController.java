package com.example.formationtcf.controller;

import com.example.formationtcf.model.Test;
import com.example.formationtcf.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
public class TestController {
@Autowired
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/create")
    public String createQuiz(@RequestBody Test test) {
        testService.saveTest(test);
        return "Quiz created successfully!";
    }

    @GetMapping("/all")
    public List<Test> getAllTests() {
        return testService.getAllTests();
    }
}
