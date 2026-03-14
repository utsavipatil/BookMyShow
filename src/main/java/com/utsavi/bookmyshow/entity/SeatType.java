package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.model.BaseModel;
import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class SeatType extends BaseModel {
  private String seatType;
}
