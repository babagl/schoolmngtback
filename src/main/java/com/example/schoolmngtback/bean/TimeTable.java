package com.spring.schoolmngtbackend.bean;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "timeTable")
@Data
public class TimeTable {
    @Id
    @Column(name = "idTimeTable")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTimeTable;
    @Column(name = "matiere",unique = true)
    private String matiere;
    @Column(name = "startTime")
    private LocalTime StartTime;
    @Column(name = "endTime")
    private LocalTime EndTime;
    @ManyToMany
    List<Instructor>instructors;


}
