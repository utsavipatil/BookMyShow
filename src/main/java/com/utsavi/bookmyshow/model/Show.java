package com.utsavi.bookmyshow.model;

import com.utsavi.bookmyshow.enums.Language;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Show extends BaseModel{
  private Theatre theatre;
  private Screen screen;
  private Movie movie;
  private Date time;
  private Language language;
  private List<ShowSeat> showSeats;
  private List<ShowSeatType> showSeatTypes;
}
