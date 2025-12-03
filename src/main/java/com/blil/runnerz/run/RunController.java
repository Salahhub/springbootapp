package com.blil.runnerz.run;

import java.util.List;

import org.checkerframework.checker.units.qual.A;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RunController {

   private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }
    @GetMapping("/api/runs")
    List<run> findAll(){
        return runRepository.findAll();
    }
}