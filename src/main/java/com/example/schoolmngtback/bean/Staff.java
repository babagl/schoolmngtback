package com.spring.schoolmngtbackend.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "staff")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    @Id
    @Column(name = "idStaff")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStaff;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "username",unique = true)
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "address")
    private String address;
    @Enumerated(EnumType.STRING)
    private Roles roles;

}
