package Task1;

import java.time.LocalDate;

public class Nurse extends Staff implements Indicatoriable {

    public Nurse() {super();}
    public Nurse(String surname, String name, LocalDate birthday) {
            super(surname, name, birthday);}
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void temperature() {
        System.out.println("Indicator temperature");
    }

    @Override
    public double getIndicatorTemperature() {
        return 36.6;
    }

    @Override
    public void bloodOxygenSaturation() {
        System.out.println("Indicator Blood Oxygen Saturation");
    }

    @Override
    public double getIndicatorBbloodOxygenSaturation() {
        return 100;
    }
}

