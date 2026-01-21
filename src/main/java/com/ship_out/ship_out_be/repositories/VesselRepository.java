package com.ship_out.ship_out_be.repositories;

import com.ship_out.ship_out_be.entities.Vessel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VesselRepository extends JpaRepository<Vessel, Long> {
}