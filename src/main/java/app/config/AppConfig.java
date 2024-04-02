package app.config;

import app.model.AnimalsCage;
import app.model.Animal;
import app.model.Cat;
import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Timer;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {


    @Bean(name = "dog")

    public Animal dog() {
        return new Dog();
    }


}
