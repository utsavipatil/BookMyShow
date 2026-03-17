package com.utsavi.bookmyshow.repository;

import com.utsavi.bookmyshow.entity.ShowSeat;
import com.utsavi.bookmyshow.enums.SeatStatus;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
  //Select * from showseat where Id In (_ , _)  and Status = ? for update
  @Lock(LockModeType.PESSIMISTIC_WRITE) //Lock fetched data, until write transaction finished - Lock only on rows
  List<ShowSeat> findAllByIdInAndSeatStatus(List<Long> ids, SeatStatus seatStatus); //Iterable any collection which can iterate
}
