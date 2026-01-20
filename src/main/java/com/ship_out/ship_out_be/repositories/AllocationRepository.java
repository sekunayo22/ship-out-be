package com.ship_out.ship_out_be.repositories;

import com.ship_out.ship_out_be.entities.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, UUID> {
}