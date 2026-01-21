package com.ship_out.ship_out_be.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import com.ship_out.ship_out_be.enums.ContainerEnum;

@Data
@NoArgsConstructor
@Entity
@Table(name="booking")
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @NotNull
    String etdOrigin;

    @Column(insertable = false, updatable = false)
    Long reference;

    @NotNull
    String lastMileStone;

    @NotNull
    String trans;

    @NotNull
    @Enumerated(EnumType.STRING)
    ContainerEnum containerType;

    @Column(insertable = false, updatable = false)
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vessel_id")
    Vessel vessel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "voyage_id")
    Voyage voyage;

    @NotNull
    Integer containerCount;

    @NotNull
    Integer teu;

    @NotNull
    Integer shipCount;
    
    @NotNull
    String carrier;

    @Column(insertable = false, updatable = false)
    Long carrierContractNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "allocation_id")
    Allocation allocationId;
}