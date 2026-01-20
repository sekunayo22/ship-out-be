package com.ship_out.ship_out_be.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "allocation_route")
public class AllocationRoute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    Voyage voyage;

    @NotNull
    Integer quantity;

    @NotNull
    String unit;

    @NotNull
    Integer utilization;

    @NotNull
    Integer outstandingCommited;

    @NotNull
    Integer etdWeek;
}