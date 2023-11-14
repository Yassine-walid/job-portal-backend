package com.example.jobportalbackend.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.print.Book;

@Entity
@Table(name = "manager")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lasName;
    private String email;
    private String password;
    private String imgUrl;
    private Number phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id",nullable = false)
    private Company company;
}
