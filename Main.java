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
        Duck duck = new Duck();
        duck.setName("Duffy");
        Pigeon pigeon = new Pigeon();
        pigeon.setName("Alf");
        Turtle turtle = new Turtle();
        turtle.setName("Leonardo");
//        System.out.println(dog.getName());
//        System.out.println(dog.getIllness());
 //       dog.getIllness().heal();
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
//       Pigeon pigeon = new Pigeon();
//        pigeon.fly();
//        pigeon.toGo();
//        pigeon.swim();
//        Turtle turtle = new Turtle();
//        turtle.toGo();
//        turtle.swim();
//        turtle.fly();
//       Duck duck = new Duck();
//          duck.toGo();
//        duck.swim();
//        duck.fly();
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog).addPatient(duck).addPatient(pigeon).addPatient(turtle);
        //System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoable());
        System.out.println(clinic.getSpeakble());
        System.out.println(clinic.getFlyable());
        System.out.println(clinic.getSwimable());
        Doctor doctor = new Doctor("Jakson", "Mike", LocalDate.of(86,10,23));
        System.out.println(doctor.getName());
        System.out.println(doctor.getSurname());
        Nurse nurse = new Nurse("Duhovniy", "Devid", LocalDate.of(83,5,11));
        System.out.println(nurse.getName());
        System.out.println(nurse.getSurname());
    }
}
