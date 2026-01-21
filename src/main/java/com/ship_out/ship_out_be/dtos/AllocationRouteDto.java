package com.ship_out.ship_out_be.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

public record AllocationRouteDto(
    Long id,
    String serviceString,
    String voyage,
    String vessel,
    LocalDateTime linkedScheduleEtd,
    LocalDateTime linkedScheduleEta,
    Integer quantity,
    String unit,
    Integer utilization,
    Integer outstandingCommited,
    Integer etdWeek
) {
}