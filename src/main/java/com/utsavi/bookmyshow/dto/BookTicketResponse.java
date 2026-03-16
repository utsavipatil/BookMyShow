package com.utsavi.bookmyshow.dto;

import com.utsavi.bookmyshow.enums.ResponseStatus;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BookTicketResponse {
  private Long bookingId;
  private ResponseStatus responseStatus;
  private String message;
}
