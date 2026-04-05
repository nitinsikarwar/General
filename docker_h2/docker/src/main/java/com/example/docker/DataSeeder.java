package com.example.docker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder {
 
    @Bean
    CommandLineRunner seedDatabase(MyRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                repo.save(new MyEntity(null, "John", "Doe"));
                repo.save(new MyEntity(null, "Alice", "Smith"));
                repo.save(new MyEntity(null, "David", "Lee"));
                System.out.println("✅ H2 Database seeded with initial data");
            } else {
                System.out.println("ℹ️ Database already contains data, skipping seeding");
            }
        };
    }
}
