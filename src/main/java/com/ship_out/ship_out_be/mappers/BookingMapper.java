package com.ship_out.ship_out_be.mappers;

import com.ship_out.ship_out_be.dtos.BookingDto;
import com.ship_out.ship_out_be.entities.Booking;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BookingMapper {

    BookingDto toDto(Booking booking);
    Booking toEntity(BookingDto bookingDto);
}