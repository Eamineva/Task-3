package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("time")
//@Scope("singleton")
public class Timer {
    //@Autowired

    //private  AnimalsCage animalscage;
    private Long nanoTime = System.nanoTime();

//    @Autowired
@Qualifier("ancage")
    public Long getTimer() {
        return nanoTime;
    }
//    @Autowired
//    public Timer() {

//    }
}
