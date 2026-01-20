package com.ship_out.ship_out_be.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

import com.ship_out.ship_out_be.enums.ContainerEnum;

@Data
@NoArgsConstructor
@Entity
@Table(name="booking")
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    UUID id;

    @NotNull
    String etdOrigin;

    @NotNull
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long reference;

    @NotNull
    String lastMileStone;

    @NotNull
    String trans;

    @NotNull
    ContainerEnum containerType;

    @NotNull
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long masterBill;

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
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long carrierContractNumber;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    Allocation allocationId;
}