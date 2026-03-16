package com.utsavi.bookmyshow.entity;

import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class SeatType extends BaseModel {
  private String seatType;
}
