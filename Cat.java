package Task1;

import java.time.LocalDate;

public class Cat extends Animal implements Speakble, Goable {
    public Cat() {
        super();
    }
    public void swim(){
        System.out.println("Cat no swim!");
    }
    public void fly(){
        System.out.println("Cat no fly!");
    }
    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;    }

    @Override
    public void speak() {
        System.out.println("meow");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }


}
