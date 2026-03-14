package com.utsavi.bookmyshow.model;

import com.utsavi.bookmyshow.entity.Seat;
import com.utsavi.bookmyshow.entity.SeatType;
import com.utsavi.bookmyshow.entity.Show;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class ShowSeatType extends BaseModel{
  @ManyToOne
  private Show show;//Once show can be part of a lot of ShowSeatType

  @ManyToOne
  private SeatType seat; //One seatType can be part of a lot of ShowSeatType

  private Integer price;
}

//show seat price
//1 Gold 200
//1 Silver 150
//1 Platinum 300
//2 Gold 200
//2 Silver 150

