package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.BookingStatus;
import com.utsavi.bookmyshow.model.BaseModel;
import com.utsavi.bookmyshow.model.ShowSeat;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
@Entity
public class  Booking extends BaseModel {
  @ManyToOne
  private User bookedBy;

  @ManyToOne
  private Show show;

  private Date bookingDate;

  @ManyToMany
  private List<ShowSeat> bookedSeats; //Cancellation: One Show seat can be present in multiple bookings

  private Integer noOfSeats;

  @Enumerated
  private BookingStatus bookingStatus;

  private Integer totalAmount;

  @OneToMany
  private List<Payment> payments; //For Partial Pay
}
