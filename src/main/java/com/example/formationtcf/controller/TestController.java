package com.example.formationtcf.controller;

import com.example.formationtcf.dto.TestDto;
import com.example.formationtcf.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tests")
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/create")
    public ResponseEntity<?> createTest(@RequestBody String testDTO)  throws Exception{
        //testService.createTest(testDTO);
        return ResponseEntity.ok("Test created successfully!");
    }

    @GetMapping("/{id}")
    public TestDto getTest(@PathVariable Long id) {
        return new TestDto();
    }
}
/*
    @GetMapping("/{id}")
    public TestDto getTest(@PathVariable Long id) {
        return new TestDto();
    }
}
*/
