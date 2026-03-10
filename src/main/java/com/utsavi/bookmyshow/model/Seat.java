package com.utsavi.bookmyshow.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Seat extends BaseModel{
  private Integer row;
  private Integer column;
  private String name;
  private ShowSeatType showSeatType;
}
