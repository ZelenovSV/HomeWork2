package Task1;

public interface Indicatoriable {

    public static final String type = "Indicatoriable";
    void temperature();
    default double getIndicatorTemperature(){
        return 36.6;
    }
    void bloodOxygenSaturation();
    default double getIndicatorBbloodOxygenSaturation(){
        return 100; }

}
