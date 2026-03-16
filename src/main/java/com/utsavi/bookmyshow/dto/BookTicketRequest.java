package com.utsavi.bookmyshow.dto;

import lombok.Getter;

import java.util.List;

@Getter 
public class BookTicketRequest {
   private Long showId;
   private Long userId;
   private List<Long> showSeatIds;
}

/* /getShowSeats?id= 7 , showSeatIds, userId , showId
* */
