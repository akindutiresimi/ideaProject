package airCondictionar;

public class AirConditionar {

    //Accessor
    private boolean powerState;
    private int temperature;

    public boolean isOn() {
        return powerState;
    }
    //mutator
    public void turnOnAc() {
        powerState = true;
        temperature = 16;

    }

    public void turnOffAc() {
        powerState = false;
        temperature = 0;
    }

    public int checkTemperature() {
        return temperature;
    }
    //mutator
    public void increase() {
        if(temperature < 30)
        temperature += 1;
    }

    public void decrease() {
        if(temperature >16)
        temperature -= 1;
    }
}
