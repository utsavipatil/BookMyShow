package com.utsavi.bookmyshow.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Screen extends BaseModel{
  private String name;
  private List<Seat> seats;
  private List<Feature> features;
}
