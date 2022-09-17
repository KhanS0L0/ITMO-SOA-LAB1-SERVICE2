package ru.itmo.soa.secondservice;

import com.github.lkqm.spring.api.version.EnableApiVersioning;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApiVersioning
public class SecondServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondServiceApplication.class, args);
    }

}
