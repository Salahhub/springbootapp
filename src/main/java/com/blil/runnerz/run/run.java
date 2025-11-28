package com.blil.runnerz.run;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record run(
    Integer id, 
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer miles,
    Location Location
) {

    }
