package com.ship_out.ship_out_be.requests;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AddVesselRequest {
    String name;
    String loop;
    String port;
    Integer weekNum;
    Integer allocation;
    LocalDateTime etd;
    LocalDateTime eta;
    LocalDateTime ata;
    LocalDateTime atd;
}
