package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {
            Student marium = new Student(
                    "Marium",
                    LocalDate.of(2000, Month.DECEMBER, 12),
                    "marium.jamal@gmail.com"
            );

            Student Alex = new Student(
                    "Alex",
                    LocalDate.of(2000, Month.DECEMBER, 12),
                    "alex.jamal@gmail.com"
            );

            repository.saveAll(
                    List.of(marium, Alex)
            );
        };
    }


}
