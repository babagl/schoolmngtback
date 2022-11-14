package com.example.schoolmngtback.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "administrator")
@Data
@AllArgsConstructor
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAdministrator;

    private String fullName;
    @Column(unique = true)
    private String username;

    private String email;

    private String password;

    private LocalDate birthday;

    private String address;
    private boolean active;

    @OneToMany
    private Set<Role> roles;


    /*@OneToMany(cascade = CascadeType.DETACH)
    List<Instructor> instructors;
    @OneToMany(cascade = CascadeType.DETACH)
    List<TimeTable> timeTables;
    @OneToMany(cascade = CascadeType.DETACH)
    List<Students> students;
    @OneToMany(cascade = CascadeType.DETACH)
    List<Staff> staff;*/

    public Administrator() {
    }

}
