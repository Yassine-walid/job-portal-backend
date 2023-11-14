package com.example.jobportalbackend.Controllers;

import com.example.jobportalbackend.Entities.Admin;
import com.example.jobportalbackend.Services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/admin")
@RequiredArgsConstructor
public class AdminController {

    @Autowired
    public final AdminService adminService;

    @PostMapping("/register")
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin){
        return ResponseEntity.ok().body(adminService.addAdmin(admin).getBody());
    }
}
