package com.doctorAppointmentBookingSystem.service;

import com.doctorAppointmentBookingSystem.entity.Role;


public interface RoleService {
    Role getDefaultRole();

    Role getRoleByAuthority(String authority);
}
