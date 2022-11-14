package com.example.schoolmngtback.bean;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "timeTable")
@Data
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTimeTable;
    @Column(unique = true)
    private String matiere;

    private LocalTime startTime;

    private LocalTime endTime;

    @ManyToOne
    private Instructor instructor;


}
