package com.example.formationtcf.repository;

import com.example.formationtcf.model.Test;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TestRepository {
    private static List<Test> tests = new ArrayList<>();

    public void saveTest(Test test) {
        tests.add(test);
    }

    public List<Test> getAllTests() {
        return tests;
    }
}
