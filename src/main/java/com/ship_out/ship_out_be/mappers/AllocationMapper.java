package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.AllocationDto;
import com.ship_out.ship_out_be.entities.Allocation;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AllocationMapper {

    AllocationDto toDto(Allocation allocation);
    Allocation toEntity(AllocationDto allocationDto);
}