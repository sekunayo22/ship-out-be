package com.ship_out.ship_out_be.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Table(name="allocation")
@NoArgsConstructor
@Entity
public class Allocation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "allocation_route_id")
    AllocationRoute allocationRoute;
}