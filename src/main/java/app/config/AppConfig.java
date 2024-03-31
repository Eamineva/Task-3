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

    /*@Bean(name = "cat")
    public Animal cat() {
        return new Cat();
    }*/
    @Bean(name = "dog")
    //@Scope("singleton")
    public Animal dog() {
        return new Dog();
    }

    //@Bean(name = "ancage")
    /*public AnimalsCage ancage(){
        //Timer timer=new Timer();
        return Animal();
    }*/
    /*@Bean(name = "time")
        public Timer getTimer(){
        Timer timer=new Timer();
        return timer;
    }*/

    /*@Bean(name = "time")
    public Timer getTimer(){
        //Timer timer=new Timer();
        return new Timer();
    }*/
}
