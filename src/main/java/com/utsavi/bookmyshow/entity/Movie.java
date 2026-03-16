package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.Feature;
import com.utsavi.bookmyshow.enums.Language;
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
  @JoinTable(
      name = "movie_cast",
      joinColumns = @JoinColumn(name = "movie_id"),
      inverseJoinColumns = @JoinColumn(name = "artist_id")
  )
  private List<Artist> cast;

  @Enumerated(EnumType.STRING) //enum is not entity, To show JPA that its entity
  @ElementCollection //When enums have list and wanted to save in DB
  private List<Language>  language;

  @Enumerated(EnumType.STRING)
  @ElementCollection
  private List<Feature> feature;
}
