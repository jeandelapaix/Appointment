package com.doctorAppointmentBookingSystem.repository;

import com.doctorAppointmentBookingSystem.entity.SettlePoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SettlePointRepository extends JpaRepository<SettlePoint, Long> {
    List<SettlePoint> findAllByOrderByName();
}
