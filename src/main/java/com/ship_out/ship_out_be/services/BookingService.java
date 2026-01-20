package com.ship_out.ship_out_be.services;


import com.ship_out.ship_out_be.dtos.VesselDto;
import com.ship_out.ship_out_be.requests.AddVesselRequest;
import com.ship_out.ship_out_be.repositories.VesselRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public BookingDto getBookingById(UUID id){
                        Booking booking = Optional.ofNullable(bookingRepository.findById(id)).orElseThrow(() -> new RuntimeException("Booking not found"));
        return bookingMapper.toDto(booking);
    }

    public List<BookingDto> getAllBookings(){
                List<Booking> bookings = bookingRepository.findAll();
        return bookings.stream().map(bookingMapper::toDto).collect(Collectors.toList());
    }


    public void deleteBooking(UUID id){
        Booking booking = Optional.ofNullable(bookingRepository.findById(id)).orElseThrow(() -> new RuntimeException("Booking not found"));
        bookingRepository.delete(booking);
    }
}
