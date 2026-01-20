package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.VesselDto;
import com.ship_out.ship_out_be.entities.Vessel;
import com.ship_out.ship_out_be.requests.AddVesselRequest;
import com.ship_out.ship_out_be.requests.UpdateVesselRequest;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface VesselMapper {

    @Mapping(target = "id", source = "vessel.id")
    @Mapping(target = "name", source = "vessel.name")
    @Mapping(target = "loop", source = "vessel.loop")
    @Mapping(target = "port", source = "vessel.port")
    @Mapping(target = "weekNum", source = "vessel.weekNum")
    @Mapping(target = "allocation", source = "vessel.allocation")
    @Mapping(target = "etd", source = "vessel.etd")
    @Mapping(target = "etdWeek", source = "vessel.etdWeek")
    @Mapping(target = "eta", source = "vessel.eta")
    @Mapping(target = "ata", source = "vessel.ata")
    @Mapping(target = "atd", source = "vessel.atd")
    VesselDto toDto(Vessel vessel);
    Vessel toEntity(AddVesselRequest addVesselRequest);
    void updateEntity(Vessel vessel, UpdateVesselRequest updateVesselRequest);
}