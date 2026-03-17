package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.Feature;
import com.utsavi.bookmyshow.enums.Language;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Table(name = "shows")
public class Show extends BaseModel {
  @ManyToOne
  private Theatre theatre;

  @ManyToOne
  private Screen screen;

  @ManyToOne
  private Movie movie;

  private Date time;

  @OneToMany(mappedBy = "show")
  private List<ShowSeat> showSeats; 

  @OneToMany(mappedBy = "show")
  private List<ShowSeatType> showSeatTypes;

  @Enumerated(EnumType.STRING)
  private Language language;

  @Enumerated(EnumType.STRING)
  @ElementCollection
  @CollectionTable(
      name = "show_features",
      joinColumns = @JoinColumn(name = "show_id")
  )
  private List<Feature> features;
}
