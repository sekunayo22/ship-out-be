package com.ship_out.ship_out_be.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Table(name="allocation")
@NoArgsConstructor
@Entity
public class Allocation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    UUID id;

    @ManyToOne
    @JoinColumn(name = "allocation_route_id")
    AllocationRoute allocationRoute;
}