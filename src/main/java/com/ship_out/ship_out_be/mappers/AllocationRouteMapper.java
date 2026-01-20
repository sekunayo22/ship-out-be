package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.AllocationRouteDto;
import com.ship_out.ship_out_be.entities.AllocationRoute;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AllocationRouteMapper {

    AllocationRouteDto toDto(AllocationRoute allocationRoute);
    AllocationRoute toEntity(AllocationRouteDto allocationRouteDto);
}