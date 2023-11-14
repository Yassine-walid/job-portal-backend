package com.example.jobportalbackend.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.util.Set;

@Entity
@Table(name = "company")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Number phoneNumber;
    private String email;
    private String imgUrl;
    private String address;
    private String website;

    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Manager> managers;
}
