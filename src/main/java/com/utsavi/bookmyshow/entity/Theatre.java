package com.utsavi.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Theatre extends BaseModel {
  private String name;
  private String address;
  private String rating;

  @ManyToOne
  private Region region;

  @OneToMany
  private List<Screen> screens;

//  @OneToMany
//  private List<Movie> movies;
}
