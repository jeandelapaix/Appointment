package com.doctorAppointmentBookingSystem.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "s_log")
public class Log implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date date;

    private String ip;

    private String text;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
