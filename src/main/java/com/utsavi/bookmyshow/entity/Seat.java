package com.utsavi.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class Seat extends BaseModel {
  private Integer rowNumber;
  private Integer columnNumber ;
  private String name;

  @ManyToOne 
  private SeatType seatType;
}
