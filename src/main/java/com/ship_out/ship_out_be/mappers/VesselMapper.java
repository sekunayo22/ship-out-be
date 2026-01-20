package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.VesselDto;
import com.ship_out.ship_out_be.models.Vessel;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface VesselMapper {

    VesselDto toDto(Vessel vessel);
    Vessel toEntity(VesselDto vesselDto);
}