package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.Feature;
import com.utsavi.bookmyshow.enums.Language;
import com.utsavi.bookmyshow.model.BaseModel;
import com.utsavi.bookmyshow.model.ShowSeat;
import com.utsavi.bookmyshow.model.ShowSeatType;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
public class Show extends BaseModel {
  @ManyToOne
  private Theatre theatre;

  @ManyToOne
  private Screen screen;

  @ManyToOne
  private Movie movie;

  private Date time;

  @OneToMany
  private List<ShowSeat> showSeats;

  @OneToMany
  private List<ShowSeatType> showSeatTypes;

  @Enumerated
  private Language language;

  @Enumerated
  @ElementCollection
  private List<Feature> features;
}
