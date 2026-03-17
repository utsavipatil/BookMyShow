package com.utsavi.bookmyshow.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BookTicketRequest {
   private Long showId;
   private Long userId;
   private List<Long> showSeatIds;
}
/* /getShowSeats?id= 7 , showSeatIds, userId , showId
* */
