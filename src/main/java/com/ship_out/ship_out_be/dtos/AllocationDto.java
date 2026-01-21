package com.ship_out.ship_out_be.dtos;


public record AllocationDto(
    Long id,
    Integer quantity,
    String unit,
    Integer utilization,
    Integer outstandingCommited,
    Integer etdWeek,
    String voyage
) {
}