package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("barsic");
//        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"), "petr",
                LocalDate.of(3,12,21));
//        System.out.println(dog.getName());
//        System.out.println(dog.getIllness());
        dog.getIllness().heal();
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
        Pigeon pigeon = new Pigeon();
        pigeon.fly();
        pigeon.toGo();
        pigeon.swim();
        Turtle turtle = new Turtle();
        turtle.toGo();
        turtle.swim();
        turtle.fly();
        Duck duck = new Duck();
        duck.toGo();
        duck.swim();
        duck.fly();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCycle();
        dog.breathe();

    }
}
