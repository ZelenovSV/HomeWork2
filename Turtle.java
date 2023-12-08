package Task1;

import java.time.LocalDate;

public class Turtle extends Animal implements Goable, Swimable {
    public Turtle() {
        super();
    }

    public void fly() {
        System.out.println("Turtle no fly!");
    }

    public Turtle(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void run() {
        System.out.println("Turtle the run");
    }

    @Override
    public double getRunSpeed() {
        return 5.5;
    }

    @Override
    public void swim() {
        System.out.println("Turtle the swim");
    }

    @Override
    public double getSwimSpeed() {
        return 2.5;
    }
}
