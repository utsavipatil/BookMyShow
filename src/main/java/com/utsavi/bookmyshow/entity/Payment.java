package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.PaymentMode;
import com.utsavi.bookmyshow.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
public class Payment extends BaseModel {
  private String referenceNumber;
  private Integer amount;
  private Date time;

  @Enumerated(EnumType.STRING)
  private PaymentMode mode;

  @Enumerated(EnumType.STRING)
  private PaymentStatus paymentStatus;

  @ManyToOne
  private Booking booking;
}
