package com.example.schoolmngtback.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "classroom")
@Data
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matriculeClassroom;


    private String className;



}
