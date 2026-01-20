package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.VoyageDto;
import com.ship_out.ship_out_be.entities.Voyage;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface VoyageMapper {

    VoyageDto toDto(Voyage voyage);
    Voyage toEntity(VoyageDto voyageDto);
}