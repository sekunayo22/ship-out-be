package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.AllocationDto;
import com.ship_out.ship_out_be.entities.Allocation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface AllocationMapper {

    @Mapping(target = "voyage", source = "allocation.allocationRoute.voyage.id")
    @Mapping(target = "etdWeek", source = "allocation.allocationRoute.etdWeek")
    @Mapping(target = "quantity", source = "allocation.allocationRoute.quantity")
    @Mapping(target = "unit", source = "allocation.allocationRoute.unit")
    @Mapping(target = "utilization", source = "allocation.allocationRoute.utilization")
    @Mapping(target = "outstandingCommited", source = "allocation.allocationRoute.outstandingCommited")
    @Mapping(target = "id", source = "allocation.id")
    AllocationDto toDto(Allocation allocation);
    Allocation toEntity(AllocationDto allocationDto);
}