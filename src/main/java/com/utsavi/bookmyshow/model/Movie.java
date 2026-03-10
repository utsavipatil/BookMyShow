package com.utsavi.bookmyshow.model;

import com.utsavi.bookmyshow.enums.Language;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true) //To get setters & getters of super class as well
public class Movie extends BaseModel{
  private String name;
  private String rating;
  private String releaseYear;
  private Language language;
  private Feature feature;
}
