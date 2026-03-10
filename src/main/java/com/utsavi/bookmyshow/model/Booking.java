package com.utsavi.bookmyshow.model;

import com.utsavi.bookmyshow.enums.BookingStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Booking extends BaseModel{
  private User user;
  private Show show;
  private Date time;
  private List<ShowSeatType> bookedSeats;
  private BookingStatus bookingStatus;
  private Integer amount;
  private List<Payment> payments; //For Partial Pay
}
