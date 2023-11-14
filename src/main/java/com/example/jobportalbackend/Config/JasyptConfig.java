package com.example.jobportalbackend.Config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfig {

    @Bean("jasyptStringEncryptor")
    public StandardPBEStringEncryptor stringEncryptor() {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("4iSPcV2oeTBVf8BEoXbsSM84gIID7p29z");
        return encryptor;
    }
}
