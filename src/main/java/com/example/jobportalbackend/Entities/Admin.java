package com.example.jobportalbackend.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "admin")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Number phoneNumber;
    private String imgUrl;
}
