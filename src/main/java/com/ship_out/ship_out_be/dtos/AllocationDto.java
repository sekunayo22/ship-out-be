package com.ship_out.ship_out_be.dtos;

import java.util.UUID;

public record AllocationDto(
    UUID id,
    Integer quantity,
    String unit,
    Integer utilization,
    Integer outstandingCommited,
    Integer etdWeek,
    String voyage
) {
}