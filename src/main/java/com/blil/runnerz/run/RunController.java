package com.blil.runnerz.run;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {

   private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @GetMapping("")
    List<run> findAll(){
        return runRepository.findAll();
    }
    @GetMapping("api/{id}")
    run findById(@PathVariable Integer id){
        return runRepository.findById(id);
    }

}