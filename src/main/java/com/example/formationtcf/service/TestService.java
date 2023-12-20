package com.example.formationtcf.service;

import com.example.formationtcf.dto.TestDto;
import com.example.formationtcf.model.Test;
import com.example.formationtcf.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public ResponseEntity<?> createTest(TestDto testDTO) {
       return  ResponseEntity.ok("Created test successfully");
    }

    public ResponseEntity<?> getTest(Long id) {
        return ResponseEntity.ok("get One test successfully");
    }
}
