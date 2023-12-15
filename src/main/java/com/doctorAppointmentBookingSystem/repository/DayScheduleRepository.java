package com.doctorAppointmentBookingSystem.repository;

import com.doctorAppointmentBookingSystem.entity.DaySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DayScheduleRepository extends JpaRepository<DaySchedule, Long> {
}
