package com.doctorAppointmentBookingSystem.service;

import com.doctorAppointmentBookingSystem.model.bindingModel.DayScheduleModel;
import com.doctorAppointmentBookingSystem.model.bindingModel.EditDayScheduleModel;


public interface DayScheduleService {
    void create(DayScheduleModel dayScheduleModel);

    void save(EditDayScheduleModel editDayScheduleModel);
    //getById(long id);
}
