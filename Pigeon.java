package Task1;

import java.time.LocalDate;

public class Pigeon extends Animal {
    public Pigeon() { super(); }
    public void swim(){
        System.out.println("Pigeon no swim!");
    }
    public Pigeon(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}