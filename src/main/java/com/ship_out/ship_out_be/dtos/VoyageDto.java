package com.ship_out.ship_out_be.dtos;

import java.time.LocalDateTime;

public record VoyageDto(
    String serviceString, 
    Long id, 
    String name, 
    LocalDateTime etd
) {
}