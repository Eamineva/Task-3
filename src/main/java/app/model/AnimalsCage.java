package app.model;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ancage")
public class AnimalsCage {


    //@Qualifier("dog")
    private Animal animal;
    //private Timer tm;
    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal) {
            this.animal = animal;
        }



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTimer());
        //System.out.println(tm.getTimer());
        System.out.println("________________________");
    }
}
