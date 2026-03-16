package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Screen extends BaseModel {
  private String name;

  @OneToMany
  private List<Seat> seats;

  /* ManyToMany - Feature is enum so hibernate won't take Cardinality, If any such thing happen this needs to be given by elementCollection  */
  @Enumerated(EnumType.STRING)
  @ElementCollection
  @CollectionTable(
      name = "screen_features",
      joinColumns = @JoinColumn(name = "screen_id")
  )
  @Column(name = "feature")
  private List<Feature> features;
}
