package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.model.BaseModel;
import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class Artist extends BaseModel {
  private String name;
}
