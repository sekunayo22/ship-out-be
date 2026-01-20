package com.ship_out.ship_out_be.dtos;

import java.util.UUID;

import com.ship_out.ship_out_be.enums.ContainerEnum;

public record BookingDto(
    String etdOrigin,
    String reference,
    String lastMileStone,
    String trans,
    ContainerEnum containerType,
    UUID masterBill,
    String loading,
    String discharge,
    String sendAgent,
    String receiveAgent,
    String destination,
    String vessel,
    String voyage,
    Integer containerCount,
    Integer teu,
    Integer shipCount,
    String carrier,
    String carrierContractNumber,
    String allocationId
) {
}