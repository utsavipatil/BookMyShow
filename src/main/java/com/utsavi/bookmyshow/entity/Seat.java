package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.model.BaseModel;
import com.utsavi.bookmyshow.model.ShowSeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
public class Seat extends BaseModel {
  private Integer row;
  private Integer column;
  private String name;

  @ManyToOne
  private ShowSeatType showSeatType;
}
