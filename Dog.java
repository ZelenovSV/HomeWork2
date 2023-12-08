package Task1;

import java.time.LocalDate;

public class Dog extends Animal implements Speakble,Goable, Swimable {
    public Dog() {
        super();
    }
    public void fly(){
        System.out.println("Dog no fly!");
    }
    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void run() {
        System.out.println("Dog the run");
    }

    @Override
    public double getRunSpeed() {
        return 5.5;
    }

    @Override
    public void swim() {
        System.out.println("Dog the swim");
    }

    @Override
    public double getSwimSpeed() {
        return 3.5;
    }

    @Override
    public void speak() {System.out.println("gav");}
}
