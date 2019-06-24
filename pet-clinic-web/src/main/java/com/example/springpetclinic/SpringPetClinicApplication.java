package com.example.springpetclinic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPetClinicApplication.class, args);
        System.out.println("Sharansh Gupta");
        Log log = LogFactory.getLog(SpringPetClinicApplication.class);
        log.info("New log created");
    }

}