package com.spring.schoolmngtbackend.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "classroom")
@Data
public class ClassRoom {
    @Id
    @Column(name = "matriculeClass")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matriculeClassroom;

    @Column(name = "className",unique = true)
    private String className;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    @JoinTable(name = "students")
    @JoinColumn(name = "matriculeClass")
    private List<Students>students;


}
