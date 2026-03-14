package com.utsavi.bookmyshow.entity;

import com.utsavi.bookmyshow.enums.PaymentMode;
import com.utsavi.bookmyshow.enums.PaymentStatus;
import com.utsavi.bookmyshow.model.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.Date;

@Getter
@Entity
public class Payment extends BaseModel {
  private String referenceNumber;
  private Integer amount;
  private Date time;

  @Enumerated
  private PaymentMode mode;

  @Enumerated
  private PaymentStatus paymentStatus;

  @ManyToOne
  private Booking booking;
}
