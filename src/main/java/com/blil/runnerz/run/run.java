package com.blil.runnerz.run;

import java.lang.reflect.AccessFlag.Location;
import java.time.LocalDateTime;

public record run(Integer id, 
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer miles,
    Location Location) {}
