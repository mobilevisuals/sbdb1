package com.example.databaseexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseexampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner setup(EmployeeRepository employeeRepository) {
        return (args) -> {
            employeeRepository.save(new Employee("Gustavo", "Kroke", true));
            employeeRepository.save(new Employee("John", "Getty", true));
            employeeRepository.save(new Employee("Jack ", "Morrison", false));
            employeeRepository.save(new Employee("David", "Galf", true));

        };
    }

}
