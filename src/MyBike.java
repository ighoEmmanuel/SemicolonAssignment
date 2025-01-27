public class MyBike {
    private int gear = 1;
    private boolean isOn = false;
    private int speed = 0;

    public boolean isOn() {
        return isOn;
    }

    public boolean isOff() {
        return !isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        gear = 1;
        speed = 0;
        isOn = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (isOn) {
            if (speed >= 0) {
                this.speed = speed;
            } else {
                this.speed = 0;
            }
        }
    }

    public void accelerate(int acceleration) {
        if (isOn) {
            speed += acceleration;
        } else {
            System.out.println("Your bike is off");
        }
    }

    public int getGear() {
        calculateGear();
        return gear;
    }

    private void calculateGear() {
        if (speed >= 0 && speed <= 20) {
            gear = 1;
        } else if (speed >= 21 && speed <= 30) {
            gear = 2;
        } else if (speed >= 31 && speed <= 40) {
            gear = 3;
        } else if (speed >= 41) {
            gear = 4;
        }
    }

    public void decelerate(int decrement) {
            if (isOn) {
                speed -= decrement;
                if (speed < 0) {
                    speed = 0;
                }
                calculateGear();
            } else {
                System.out.println("Your bike is off");
            }

    }
}
