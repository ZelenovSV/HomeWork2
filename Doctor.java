package Task1;

import java.time.LocalDate;

public class Doctor extends Staff implements Inspection {

    public Doctor() {
        super();
    }
    public Doctor(String surname, String name, LocalDate birthday) {
        super(surname, name, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void inspectionExternal() {
        System.out.println("The doctor performed an external examination");
    }

    @Override
    public void inspectionTest() {
        System.out.println("The doctor checked the tests");
    }
}