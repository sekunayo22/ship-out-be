package com.ship_out.ship_out_be.services;


import com.ship_out.ship_out_be.dtos.BookingDto;
import com.ship_out.ship_out_be.entities.Booking;
import com.ship_out.ship_out_be.repositories.BookingRepository;
import com.ship_out.ship_out_be.mappers.BookingMapper;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public BookingDto getBookingById(Long id){
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> new RuntimeException("Booking not found"));
        return bookingMapper.toDto(booking);
    }

    public List<BookingDto> getAllBookings(){
        List<Booking> bookings = bookingRepository.findAll();
        return bookings.stream().map(bookingMapper::toDto).collect(Collectors.toList());
    }
    public void deleteBooking(Long id){
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> new RuntimeException("Booking not found"));
        bookingRepository.delete(booking);
    }
}