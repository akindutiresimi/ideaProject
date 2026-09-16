package bikeFolder;

public class Bike {
    private boolean powerState;
    private int gearShift;



    public boolean isOn() {
        return powerState;
    }

    public void turnOn() {
        powerState = true;
    }

    public void turnoff() {
        powerState = false;
    }

    public int gear() {
        return gearShift;
    }

    public void acceleration() {

        if(gearShift >= 0 && gearShift <= 20) {
            gearShift = gearShift + 1;
        }
        else if(gearShift >= 21 && gearShift <= 30) {
            gearShift = gearShift + 2;
        }
        else if(gearShift >= 31 && gearShift <= 40) {
            gearShift = gearShift + 3;
        }
        else if(gearShift >= 41) {
            gearShift = gearShift + 4;
        }

    }


    public void deceleration() {

       if(gearShift >= 0 && gearShift <= 20) {
           gearShift = gearShift - 1;
       }
       else if(gearShift >= 21 && gearShift <= 30) {
           gearShift = gearShift - 2;
       }
        else if(gearShift >= 31 && gearShift <= 40) {
            gearShift = gearShift - 3;
        }
        else if(gearShift <= 41) {
            gearShift = gearShift - 4;
        }
    }
}

