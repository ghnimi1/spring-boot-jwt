package com.example.formationtcf.service;

import com.example.formationtcf.model.Test;
import com.example.formationtcf.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private final TestRepository testRepository ;

    @Autowired
    public TestService(TestRepository quizRepository) {
        this.testRepository = quizRepository;
    }

    public void saveTest(Test test) {
        testRepository.saveTest(test);
    }

    public List<Test> getAllTests() {
        return testRepository.getAllTests();
    }
}
