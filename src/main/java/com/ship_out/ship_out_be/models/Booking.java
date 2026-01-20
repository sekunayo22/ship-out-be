package com.ship_out.ship_out_be.models;

public class Booking {
    String etdOrigin;
    String reference;
    String lastMileStone;
    String trans;
    ContainerEnum containerType;
    UUID masterBill;
    String loading;
    String discharge;
    String sendAgent;
    String receiveAgent;
    String destination;
    String vessel;
    String voyage;
    Integer containerCount;
    Integer teu;
    Integer shipCount;
    String carrier;
    String carrierContractNumber;
    String allocationId;
}