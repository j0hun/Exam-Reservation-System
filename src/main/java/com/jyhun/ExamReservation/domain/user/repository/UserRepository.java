package com.jyhun.ExamReservation.domain.user.repository;

import com.jyhun.ExamReservation.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
