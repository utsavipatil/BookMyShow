package com.utsavi.bookmyshow.model;

import com.utsavi.bookmyshow.enums.PaymentMode;
import com.utsavi.bookmyshow.enums.PaymentStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Date;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Payment extends BaseModel{
  private String referenceNumber;
  private Integer amount;
  private Date time;
  private PaymentMode mode;
  private PaymentStatus paymentStatus;
}
