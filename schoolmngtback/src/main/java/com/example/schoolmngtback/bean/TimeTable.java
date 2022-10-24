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
//    @Column(name = "idTimeTable")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTimeTable;
    @Column(unique = true)
    private String matiere;

    private LocalTime StartTime;

    private LocalTime EndTime;
    @ManyToMany
    List<Instructor>instructors;


}
