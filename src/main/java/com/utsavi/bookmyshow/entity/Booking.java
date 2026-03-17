package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
@Entity
@Builder
public class Booking extends BaseModel {
  @ManyToOne
  private User bookedBy;

  @ManyToOne
  private Show show;

  private Date bookingDate;

  @ManyToMany
  @JoinTable(
      name = "booking_booked_seats",
      joinColumns = @JoinColumn(name = "booking_id"),
      inverseJoinColumns = @JoinColumn(name = "show_seat_id")
  )
  private List<ShowSeat> bookedSeats; //Cancellation: One Show seat can be present in multiple bookings

  private Integer noOfSeats;

//  @Enumerated(EnumType.ORDINAL) With this bookingStatus will be tinyint - 0 , 1 ,2 and generated respective mapping
  @Enumerated(EnumType.STRING) //bookingStatus column will have values like PENDING, CANCELLED
  private BookingStatus bookingStatus;

  private Integer totalAmount;

  @OneToMany(mappedBy = "booking")
  private List<Payment> payments; //For Partial Pay
}
