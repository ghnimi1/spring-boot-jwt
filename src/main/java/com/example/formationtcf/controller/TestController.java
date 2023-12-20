package com.example.formationtcf.controller;

import com.example.formationtcf.dto.TestDto;
import com.example.formationtcf.model.Test;
import com.example.formationtcf.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/create")
    public ResponseEntity<?> createTest(@RequestBody String name)  throws Exception{
        //testService.createTest(testDTO);
        System.out.println("In here");
        return ResponseEntity.ok(name);
    }

    @GetMapping("/{id}")
    public TestDto getTest(@PathVariable Long id) {
        // Implement logic to convert entity to DTO and return
        return new TestDto();
    }
}
