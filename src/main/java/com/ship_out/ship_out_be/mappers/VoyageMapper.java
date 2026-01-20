package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.VoyageDto;
import com.ship_out.ship_out_be.entities.Voyage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface VoyageMapper {

    @Mapping(target = "id", source = "voyage.id")
    @Mapping(target = "name", source = "voyage.vessel.name")
    @Mapping(target = "etd", source = "voyage.vessel.etd")
    @Mapping(target = "serviceString", source = "voyage.serviceString")
    VoyageDto toDto(Voyage voyage);
}