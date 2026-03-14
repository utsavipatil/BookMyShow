package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.Feature;
import com.utsavi.bookmyshow.enums.Language;
import com.utsavi.bookmyshow.model.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Movie extends BaseModel {
  private String title;
  private String director;
  private String genre;
  private String rating;
  private String releaseYear;

  @ManyToMany
  private List<Artist> cast;

  @Enumerated //enum is not entity, To show JPA that its entity
  @ElementCollection //When enums have list and wanted to save in DB
  private List<Language>  language;

  @Enumerated
  @ElementCollection
  private List<Feature> feature;
}
