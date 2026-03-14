package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.model.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class User extends BaseModel {
  private String name;
  private String email;

  @OneToMany
  private List<Booking> bookings;
}
