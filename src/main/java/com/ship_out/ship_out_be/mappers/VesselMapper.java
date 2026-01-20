package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.VesselDto;
import com.ship_out.ship_out_be.entities.Vessel;
import com.ship_out.ship_out_be.requests.AddVesselRequest;
import com.ship_out.ship_out_be.requests.UpdateVesselRequest;

import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface VesselMapper {

    VesselDto toDto(Vessel vessel);
    Vessel toEntity(AddVesselRequest addVesselRequest);
    void updateEntity(Vessel vessel, UpdateVesselRequest updateVesselRequest);
}