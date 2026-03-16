package com.utsavi.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Region extends BaseModel {
  private String name;

  @OneToMany
  private List<Theatre> theatres;
}
