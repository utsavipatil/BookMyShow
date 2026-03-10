package com.utsavi.bookmyshow.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Theatre extends BaseModel{
  private String name;
  private String address;
  private String rating;
  private List<Screen> screens;
  private List<Movie> movies;
}
