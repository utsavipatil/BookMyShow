package com.utsavi.bookmyshow.repository;

import com.utsavi.bookmyshow.entity.ShowSeat;
import com.utsavi.bookmyshow.enums.SeatStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
  //Select * from showseat where Id In (_ , _)  and Status =
  List<ShowSeat> findAllByIdAndSeatStatus(Iterable<Long> ids, SeatStatus seatStatus); //Iterable any collection which can iterate
}
