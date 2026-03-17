package com.utsavi.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Getter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseModel {
  private String username;
  private String email;

  @OneToMany(mappedBy = "bookedBy") //Don't create another table this is already mapped with Booking table with bookedBy foreign key
  private List<Booking> bookings;
}
