package com.example.schoolmngtback.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "instructor")
@Data
@AllArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idInstructor;

    private String fullName;
    @Column(unique = true)
    private String username;

    private String email;

    private String password;

    private LocalDate Birthday;

    private String address;
    @Enumerated(EnumType.STRING)
    private Roles roles;
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE}
    )
    List<TimeTable> timeTables;

    public Instructor() {

    }
}
