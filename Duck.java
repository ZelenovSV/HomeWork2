package Task1;

import java.time.LocalDate;

public class Duck extends Animal implements Speakble,Flyable,Goable,Swimable{
    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void run() {
        System.out.println("Duck the run");
    }

    @Override
    public double getRunSpeed() {
        return 5.5;
    }
    @Override
    public void fly() {
        System.out.println("Duck the fly");
    }

    @Override
    public double getFlySpeed() {
        return 3.5;
    }


    @Override
    public void swim() {
        System.out.println("Duck the swim");
    }

    @Override
    public double getSwimSpeed() {
        return 2.5;
    }

    @Override
    public void speak() {System.out.println("krya");}
}

