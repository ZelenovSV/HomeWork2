package Task1;

import java.time.LocalDate;

public class Pigeon extends Animal implements Goable, Flyable{
    public Pigeon() { super(); }
    public void swim(){
        System.out.println("Pigeon no swim!");
    }
    public Pigeon(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {System.out.println("Pigeon the run");}

    @Override
    public double getRunSpeed() {
        return 5.5;
    }

    @Override
    public void fly() {System.out.println("Pigeon the fly");}

    @Override
    public double getFlySpeed() {
        return 2.5;
    }
}