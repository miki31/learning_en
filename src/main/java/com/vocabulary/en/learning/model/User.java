package com.vocabulary.en.learning.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String nickName;

    @Column(columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String photo;

    @ManyToMany
    @JoinTable(name = "user_role",
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;


}
