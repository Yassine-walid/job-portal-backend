package com.example.jobportalbackend.Services.Implimentations;

import com.example.jobportalbackend.Entities.Admin;
import com.example.jobportalbackend.Repositories.AdminRepository;
import com.example.jobportalbackend.Services.AdminService;
import lombok.RequiredArgsConstructor;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {


    @Autowired
    private AdminRepository adminRepository;
    private final StringEncryptor jasyptEncryptor;

    public AdminServiceImpl( @Qualifier("jasyptStringEncryptor")  StringEncryptor jasyptEncryptor){
        this.jasyptEncryptor = jasyptEncryptor;
    }
    public ResponseEntity<Admin> addAdmin(Admin admin){
        if(admin.getImgUrl() == null){
            admin.setImgUrl("https://placehold.co/400x400");
        }
        admin.setPassword(jasyptEncryptor.encrypt(admin.getPassword()));
        adminRepository.save(admin);

        return ResponseEntity.ok().body(admin);
    }


}
