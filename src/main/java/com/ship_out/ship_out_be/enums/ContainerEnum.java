package com.ship_out.ship_out_be.enums;

public enum ContainerEnum {
    
    FCL("Full Container Load"),
    LCL("Less than Container Load");

    String description;

    ContainerEnum(String description) {
        this.description = description;
    }
}