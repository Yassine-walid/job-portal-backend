package com.example.jobportalbackend;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class JobPortalBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobPortalBackendApplication.class, args);
    }

}
