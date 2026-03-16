package com.utsavi.bookmyshow.entity;

import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Artist extends BaseModel {
  private String name;
}
