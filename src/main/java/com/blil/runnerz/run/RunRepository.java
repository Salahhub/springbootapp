package com.blil.runnerz.run;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {

     private List<run> runs = new ArrayList<>();

    public List<run> findAll() {
        return runs;

} 

run findById(int id) {
    return runs.stream()
            .filter(run -> run.id() == id)
            .findFirst()
            .get();
}
@PostConstruct

public void initData() {
    runs.add(new run(1, "Morning Run", null, null, 5, Location.OUTDOOR));
    runs.add(new run(2, "Evening Run", null, null, 3, Location.INDOOR));



}
}
