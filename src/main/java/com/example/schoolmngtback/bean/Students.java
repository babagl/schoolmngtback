package com.spring.schoolmngtbackend.bean;

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
    @Column(name = "idStudent")
    private Long idStudent;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "username",unique = true)
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String Email;
    @Column(name = "birthday")
    private LocalDate birthDay;
    @Column(name = "address")
    private String address;
    @Enumerated(EnumType.STRING)
    private Roles roles;
    @Column(name = "registrationDate")
    private LocalDateTime DateOfRegister;
    @OneToOne
    private TimeTable timeTable;


    public Students() {

    }

}
