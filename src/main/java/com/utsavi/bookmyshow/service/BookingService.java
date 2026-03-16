package com.utsavi.bookmyshow.service;

import com.utsavi.bookmyshow.entity.Booking;
import com.utsavi.bookmyshow.entity.Show;
import com.utsavi.bookmyshow.entity.ShowSeat;
import com.utsavi.bookmyshow.entity.User;
import com.utsavi.bookmyshow.enums.BookingStatus;
import com.utsavi.bookmyshow.enums.SeatStatus;
import com.utsavi.bookmyshow.repository.BookingRepository;
import com.utsavi.bookmyshow.repository.ShowRepository;
import com.utsavi.bookmyshow.repository.ShowSeatRepository;
import com.utsavi.bookmyshow.repository.UserReposiotry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

  BookingRepository bookingRepository;

  ShowRepository showRepository;

  ShowSeatRepository showSeatRepository;

  UserReposiotry userReposiotry;

  @Autowired
  public BookingService(BookingRepository bookingRepository, ShowRepository showRepository, ShowSeatRepository showSeatRepository, UserReposiotry userReposiotry){
    this.bookingRepository = bookingRepository;
    this.showRepository = showRepository;
    this.showSeatRepository = showSeatRepository;
  }

  public Booking bookTicket(Long showId, Long userId, List<Long> showSeatIds){
    /* 1) get user from db */
    Optional<User> userOptional = userReposiotry.findById(userId);
    User user;
    if(userOptional.isEmpty()){
      user = User.builder().username("USER-" + userId).build();
      userReposiotry.save(user);
    }else{
      user = userOptional.get();
    }
    
    /* 2) get show from db */
    Optional<Show> showOptional = showRepository.findById(showId);
    if(showOptional.isEmpty()){
      throw new RuntimeException("Invalid show !!!");
    }
    Show show = showOptional.get();

    /* 3) get show seats from db 4) Check if all seats are available */
    List<ShowSeat> showSeatList = showSeatRepository.findAllByIdAndSeatStatus(showSeatIds , SeatStatus.AVAILABLE);

    if(showSeatList.size() < showSeatIds.size()){
      throw new RuntimeException("Certain show seats are not available !!!");
    }

    /* 5) If yes, block seats */
    for(ShowSeat showSeat: showSeatList){
      showSeat.setSeatStatus(SeatStatus.BLOCKED);
    }

    showSeatRepository.saveAll(showSeatList);

    /* 6) Create booking */
     Booking booking = Booking.builder()
        .bookedBy(user)
        .bookingDate(new Date())
        .bookingStatus(BookingStatus.PENDING)
        .bookedSeats(showSeatList)
        .totalAmount(100) //Implement Logic to get price
        .noOfSeats(showSeatList.size())
        .build();

    return bookingRepository.save(booking);
  }
}
