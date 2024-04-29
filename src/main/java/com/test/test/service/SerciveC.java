package com.test.test.service;

import com.test.test.model.TrainingCenter;
import com.test.test.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerciveC {
    @Autowired
    private Repo repo;

    public String addTraningCenter(TrainingCenter trainingCenter) {
        repo.save(trainingCenter);
        return " saved";
    }

    public List<TrainingCenter> getTraningCenter() {
        return  repo.findAll();
    }
}
