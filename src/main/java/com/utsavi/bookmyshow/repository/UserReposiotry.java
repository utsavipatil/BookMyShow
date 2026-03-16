package com.utsavi.bookmyshow.repository;

import com.utsavi.bookmyshow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposiotry extends JpaRepository<User, Long> {
}
