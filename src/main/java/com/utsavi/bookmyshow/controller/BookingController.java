package com.utsavi.bookmyshow.controller;

import com.utsavi.bookmyshow.dto.BookTicketRequest;
import com.utsavi.bookmyshow.dto.BookTicketResponse;
import com.utsavi.bookmyshow.entity.Booking;
import com.utsavi.bookmyshow.enums.ResponseStatus;
import com.utsavi.bookmyshow.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

  BookingService bookingService;

  @Autowired
  public BookingController(BookingService bookingService){
    this.bookingService = bookingService;
  }

  @PostMapping
  public ResponseEntity<BookTicketResponse> bookTicket(@RequestBody BookTicketRequest request){
    
    try{
      Booking booking = bookingService.bookTicket(request.getShowId(), request.getUserId(), request.getShowSeatIds());

      return ResponseEntity.status(HttpStatus.CREATED).body(BookTicketResponse.builder()
          .responseStatus(ResponseStatus.SUCCESS)
          .bookingId(booking.getId())
          .message("Booking Confirmed. Please make Payment !").build());
    }catch(Exception exception){

      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(BookTicketResponse.builder()
          .responseStatus(ResponseStatus.FAILURE)
          .message("Booking failed: " + exception.getMessage()).build());
    }
  }
}
