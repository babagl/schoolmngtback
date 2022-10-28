package com.example.schoolmngtback.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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

    @Enumerated(EnumType.STRING)
    private Roles roles;

    public Administrator(String fullName, String username, String email, String password, LocalDate birthday, String address, boolean active, Roles roles) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
        this.active = active;
        this.roles = roles;
    }
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
