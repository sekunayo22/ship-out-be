package com.ship_out.ship_out_be.dtos;


import java.time.LocalDateTime;

public record VesselDto(
    Long id,
    String name, 
    String loop, 
    String port, 
    Integer weekNum, 
    Integer allocation, 
    LocalDateTime etd, 
    Integer etdWeek,
    LocalDateTime eta, 
    LocalDateTime ata, 
    LocalDateTime atd
) {
}
