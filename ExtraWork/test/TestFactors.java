import classActivity.Factors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFactors {

    private Factors factors;

    @BeforeEach
    void setUp() {
        factors = new Factors();
    }
    @Test
    public void whenIAddXYZ_ItChecksMutiplesOfZInXY() {
        List<Integer> results = new ArrayList<>();
        results.add(2);
        results.add(4);
        results.add(6);
        results.add(8);
        results.add(10);
        assertEquals(results,factors.getMultiplesOfTheLastInput(1,10,2));
    }


    @Test
    public void whenIAddXYZ_IfXIsNegativeItThrowErrorMessage() {
        assertThrows(IllegalArgumentException.class, () -> factors.getMultiplesOfTheLastInput(-1,5,4),
                "beginning is negative");
    }

    @Test
    public void whenIAddXYZ_IfYIsNegativeItThrowErrorMessage() {
        assertThrows(IllegalArgumentException.class,() -> factors.getMultiplesOfTheLastInput(1,-7,4),
                "end is negative");
    }

    @Test
    public void whenIAddXYZ_IfZIsNegativeItThrowErrorMessage() {
        assertThrows(IllegalArgumentException.class,() -> factors.getMultiplesOfTheLastInput(1,10,-2)
        ,"divisor is negative");
    }

    @Test
    public void whenIAddXYZ_IfXIsGreaterThanYItThrowErrorMessage() {
        assertThrows(IllegalArgumentException.class,() -> factors.getMultiplesOfTheLastInput(10,1,2),
                "beginning is greater than end");
    }

}
