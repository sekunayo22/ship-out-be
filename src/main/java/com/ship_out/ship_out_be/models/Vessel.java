package com.ship_out.ship_out_be.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.UUID;

public class Vessel  {
    String name;
    String loop;
    String port;
    Integer weekNum;
    Integer allocation;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
}
