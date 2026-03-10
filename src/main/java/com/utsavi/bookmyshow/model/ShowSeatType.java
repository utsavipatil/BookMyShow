package com.utsavi.bookmyshow.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class ShowSeatType extends BaseModel{
  private Show show;
  private Seat seat;
  private Integer price;
}
