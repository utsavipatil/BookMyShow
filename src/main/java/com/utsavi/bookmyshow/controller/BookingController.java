package com.utsavi.bookmyshow.controller;

import com.utsavi.bookmyshow.dto.BookTicketRequest;
import com.utsavi.bookmyshow.dto.BookTicketResponse;
import com.utsavi.bookmyshow.entity.Booking;
import com.utsavi.bookmyshow.enums.ResponseStatus;
import com.utsavi.bookmyshow.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

  BookingService bookingService;

  @Autowired
  public BookingController(BookingService bookingService){
    this.bookingService = bookingService;
  }

  public BookTicketResponse bookTicket(BookTicketRequest request){
    
    try{
      Booking booking = bookingService.bookTicket(request.getShowId(), request.getUserId(), request.getShowSeatIds());

      return BookTicketResponse.builder()
          .responseStatus(ResponseStatus.SUCCESS)
          .bookingId(booking.getId())
          .message("Booking Confirmed. Please make Payment !").build();
    }catch(Exception exception){

      return BookTicketResponse.builder()
          .responseStatus(ResponseStatus.FAILURE)
          .message("Booking failed: " + exception.getMessage()).build();
    }
  }
}
