package com.ship_out.ship_out_be.dtos;

import java.util.UUID;

public record VoyageDto(
    String serviceString, 
    UUID id, 
    String name, 
    Integer etd
) {
}