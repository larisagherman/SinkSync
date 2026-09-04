package com.schedule.SinkSync.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
@Data
@Entity
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Time date;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

}
