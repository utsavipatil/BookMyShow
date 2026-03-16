package com.utsavi.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Builder
@Table(name = "users")
public class User extends BaseModel {
  private String username;
  private String email;

  @OneToMany
  private List<Booking> bookings;
}
