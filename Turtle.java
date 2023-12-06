package Task1;

import java.time.LocalDate;

public class Turtle extends Animal {
    public Turtle() {
        super();
    }
    public void fly(){
        System.out.println("Turtle no fly!");
    }
    public Turtle(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}
