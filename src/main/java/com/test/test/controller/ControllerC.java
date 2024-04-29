package com.test.test.controller;

import com.test.test.model.TrainingCenter;
import com.test.test.service.SerciveC;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ControllerC {
    @Autowired
    private SerciveC sercive;
    @PostMapping("/traning/center")
    public String addTrning( @Valid  @RequestBody TrainingCenter trainingCenter){
        return sercive.addTraningCenter(trainingCenter);
    }

    @GetMapping("/traning/center")
    public List<TrainingCenter> getTrning(){
        return sercive.getTraningCenter();
    }
}
