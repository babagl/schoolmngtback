package com.example.schoolmngtback.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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
    @OneToMany
    private Set<Role> roles;
    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE}
    )
    List<TimeTable> timeTables;

    public Instructor() {

    }
}
