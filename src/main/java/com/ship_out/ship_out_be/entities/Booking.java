package com.ship_out.ship_out_be.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Table(name="booking")
@NoArgsConstructor
@Entity
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    UUID id;

    @NotNull
    String etdOrigin;

    @NotNull
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    String reference;

    @NotNull
    String lastMileStone;

    @NotNull
    String trans;

    @NotNull
    ContainerEnum containerType;

    @NotNull
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    UUID masterBill;

    @NotNull
    String loading;

    @NotNull
    String discharge;

    @NotNull
    String sendAgent;

    @NotNull
    String receiveAgent;

    @NotNull
    String destination;

    @NotNull
    String destination;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    Vessel vessel;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    Voyage voyage;

    @NotNull
    Integer containerCount;

    @NotNull
    Integer teu;

    @NotNull
    Integer shipCount;
    
    @NotNull
    String carrier;

    @NotNull
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    String carrierContractNumber;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    Allocation allocationId;
}