package com.example.schoolmngtback.bean;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

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

    private LocalDateTime registrationDate;
    /*@OneToOne
    private TimeTable timeTable;*/
    @OneToMany
    private Set<Role> roles;

    @ManyToOne
    private ClassRoom classroom;


    public Students() {

    }

}
