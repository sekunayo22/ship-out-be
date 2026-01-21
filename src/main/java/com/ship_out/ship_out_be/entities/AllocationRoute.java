package com.ship_out.ship_out_be.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "allocation_route")
public class AllocationRoute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "voyage_id")
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