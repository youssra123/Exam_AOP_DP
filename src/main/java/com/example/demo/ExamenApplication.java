package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.Aspect.AppContext;
import com.example.demo.Composite.*;
import com.example.demo.Observer.Observable;
import com.example.demo.Observer.Observer;
import com.example.demo.Observer.Parametrage;
import com.example.demo.stratgy.Dessin;

import java.util.ArrayList;

@SpringBootApplication
public class ExamenApplication {

    public static void main(String[] args) {
        AppContext.authenticateUser("admin","admin",new String[]{"admin"});
        SpringApplication.run(ExamenApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(Circle t,Rectangle r,Parametrage p){
        return args -> {
            t.surface();
            r.piremiter();
            p.add(t);
            p.add(r);

        };
    }
}
