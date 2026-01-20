package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.BookingDto;
import com.ship_out.ship_out_be.entities.Booking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface BookingMapper {

    @Mapping(target = "voyage", source = "booking.voyage.id")
    @Mapping(target = "vessel", source = "booking.vessel.name")
    @Mapping(target = "allocationId", source = "booking.allocationId.id")
    @Mapping(target = "id", source = "booking.id")
    @Mapping(target = "containerType", source = "booking.containerType")
    @Mapping(target = "masterBill", source = "booking.masterBill")
    @Mapping(target = "loading", source = "booking.loading")
    @Mapping(target = "discharge", source = "booking.discharge")
    @Mapping(target = "sendAgent", source = "booking.sendAgent")
    @Mapping(target = "receiveAgent", source = "booking.receiveAgent")
    @Mapping(target = "destination", source = "booking.destination")
    @Mapping(target = "carrier", source = "booking.carrier")
    @Mapping(target = "carrierContractNumber", source = "booking.carrierContractNumber")
    @Mapping(target = "containerCount", source = "booking.containerCount")
    @Mapping(target = "teu", source = "booking.teu")
    @Mapping(target = "shipCount", source = "booking.shipCount")
    @Mapping(target = "reference", source = "booking.reference")
    @Mapping(target = "lastMileStone", source = "booking.lastMileStone")
    @Mapping(target = "trans", source = "booking.trans")
    @Mapping(target = "etdOrigin", source = "booking.etdOrigin")
    BookingDto toDto(Booking booking);
}