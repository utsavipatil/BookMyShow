package com.utsavi.bookmyshow.model;

import com.utsavi.bookmyshow.enums.SeatStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class ShowSeat extends BaseModel{
  private Show show;
  private Seat seat;
  private SeatStatus seatStatus;
}
