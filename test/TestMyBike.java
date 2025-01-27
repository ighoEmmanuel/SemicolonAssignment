import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyBike {

    @Test
    public void TestThatMyBikeIsOn() {
        MyBike bike = new MyBike();
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void TestThatMyBikeIsOff() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.turnOff();
        assertTrue(bike.isOff());
    }


    @Test
    public void TestGearOneAcceleration() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(2);
        bike.accelerate(18);
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void TestGearTwoAccelerationAndDecelerate() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(2);
        bike.accelerate(20);
        assertEquals(22, bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.decelerate(5);
        assertEquals(1, bike.getGear());
        assertEquals(17, bike.getSpeed());
    }
    @Test
    public void TestThatBikeGearChangesToGearTwoAfterAcceleration() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(20);
        assertEquals(1, bike.getGear());
        bike.accelerate(1);
        assertEquals(21, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }
}
