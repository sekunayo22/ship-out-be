package com.ship_out.ship_out_be.repositories;

import com.ship_out.ship_out_be.entities.AllocationRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AllocationRouteRespository extends JpaRepository<AllocationRoute, UUID> {   
}   