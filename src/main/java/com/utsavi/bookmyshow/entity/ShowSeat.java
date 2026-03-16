package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {

  @ManyToOne
  private Show show; //Once show can be part of a lot of ShowSeatType

  @ManyToOne
  private Seat seat; //One seat can be part of a lot of ShowSeatType

  @Enumerated(EnumType.STRING)
  private SeatStatus seatStatus;
}

//show seat price
//1 A1 A
//1 A2 A
//1 A3 A
//2 A1 B
//2 A2 B
