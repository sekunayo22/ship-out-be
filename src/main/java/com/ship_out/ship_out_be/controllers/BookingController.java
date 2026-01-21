package com.ship_out.ship_out_be.controllers;

import com.ship_out.ship_out_be.dtos.BookingDto;
import com.ship_out.ship_out_be.services.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/bookings")
    public ResponseEntity<List<BookingDto>> getAllBookings() {
        List<BookingDto> bookingDTOs = bookingService.getAllBookings();
        return ResponseEntity.ok()
                .body(bookingDTOs);
    }
}