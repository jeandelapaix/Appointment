package com.doctorAppointmentBookingSystem.service;

import com.doctorAppointmentBookingSystem.entity.Log;
import com.doctorAppointmentBookingSystem.model.viewModel.LogViewModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface LogService {
    void save(Log log);

    Page<LogViewModel> getAll(Pageable pageable);
}
