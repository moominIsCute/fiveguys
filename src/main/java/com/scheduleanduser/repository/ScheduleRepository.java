package com.scheduleanduser.repository;

import com.scheduleanduser.entity.Schedule;
import org.aspectj.apache.bcel.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
