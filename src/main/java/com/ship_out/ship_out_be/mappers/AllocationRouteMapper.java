package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.AllocationRouteDto;
import com.ship_out.ship_out_be.entities.AllocationRoute;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface AllocationRouteMapper {

    @Mapping(target = "voyage", source = "allocationRoute.voyage.id")
    @Mapping(target = "etdWeek", source = "allocationRoute.etdWeek")
    @Mapping(target = "quantity", source = "allocationRoute.quantity")
    @Mapping(target = "unit", source = "allocationRoute.unit")
    @Mapping(target = "utilization", source = "allocationRoute.utilization")
    @Mapping(target = "outstandingCommited", source = "allocationRoute.outstandingCommited")
    @Mapping(target = "id", source = "allocationRoute.id")
    @Mapping(target = "vessel", source = "allocationRoute.vessel")
    @Mapping(target = "linkedScheduleEtd", source = "allocationRoute.linkedScheduleEtd")
    @Mapping(target = "linkedScheduleEta", source = "allocationRoute.linkedScheduleEta")
    AllocationRouteDto toDto(AllocationRoute allocationRoute);
    AllocationRoute toEntity(AllocationRouteDto allocationRouteDto);
}