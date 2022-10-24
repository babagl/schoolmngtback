package com.example.schoolmngtback.bean;

import lombok.AllArgsConstructor;
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

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStaff;

    private String fullName;
    @Column(unique = true)
    private String username;

    private String email;

    private String password;

    private LocalDate birthday;

    private String address;
    @Enumerated(EnumType.STRING)
    private Roles roles;

}
