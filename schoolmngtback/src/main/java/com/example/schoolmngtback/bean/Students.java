package com.example.schoolmngtback.bean;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name ="students")
@Data
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idStudent;

    private String fullName;
    @Column(unique = true)
    private String username;

    private String password;

    private String email;

    private LocalDate birthday;

    private String address;
    @Enumerated(EnumType.STRING)
    private Roles roles;

    private LocalDateTime registrationDate;
    @OneToOne
    private TimeTable timeTable;

    @ManyToOne
    private ClassRoom classRoom;


    public Students() {

    }

}
