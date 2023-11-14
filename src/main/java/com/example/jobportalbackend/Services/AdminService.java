package com.example.jobportalbackend.Services;

import com.example.jobportalbackend.Entities.Admin;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public interface AdminService {
    ResponseEntity<Admin> addAdmin(Admin admin);
}
