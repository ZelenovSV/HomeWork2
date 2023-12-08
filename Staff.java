package Task1;

import java.time.LocalDate;

public abstract class Staff {
    protected String surname;
    protected String name;
    private LocalDate birthday;

    public Staff() {
    }
    public Staff(String surname, String name, LocalDate birthday) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract String getName();
    public void setSurname(String name){
        this.surname = surname;
    }
    public abstract String getSurname();


}
