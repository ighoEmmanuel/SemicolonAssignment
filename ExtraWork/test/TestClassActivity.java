import classActivity.ClassActivity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class TestClassActivity {
    ClassActivity classActivity;
    @BeforeEach
    void setUp() {
        classActivity = new ClassActivity();
    }
    @Test
    public void whenIAListNumbersWithMissingNumbersToMyFunctionItReturnsCorrectMissingNumbers() {
        List<Integer> inputNumbers = new ArrayList<>();
        inputNumbers.add(1);
        inputNumbers.add(5);
        inputNumbers.add(6);
        inputNumbers.add(8);
        List<Integer> expectedMissingNumbers = new ArrayList<>();
        expectedMissingNumbers.add(2);
        expectedMissingNumbers.add(3);
        expectedMissingNumbers.add(4);
        expectedMissingNumbers.add(7);

        List<Integer> actualMissingNumbers = classActivity.getMissingNumber(inputNumbers);
        assertEquals(expectedMissingNumbers, actualMissingNumbers);
    }

    @Test
    public void whenIAListOfDisarrangedNumbersWithMissingNumbersToMyFunctionReturnsCorrectMissingNumbers() {
        List<Integer> inputNumbers = new ArrayList<>();
        inputNumbers.add(5);
        inputNumbers.add(1);
        inputNumbers.add(8);
        inputNumbers.add(6);
        List<Integer> expectedMissingNumbers = new ArrayList<>();
        expectedMissingNumbers.add(2);
        expectedMissingNumbers.add(3);
        expectedMissingNumbers.add(4);
        expectedMissingNumbers.add(7);
        List<Integer> actualMissingNumbers = classActivity.getMissingNumber(inputNumbers);
        assertEquals(expectedMissingNumbers, actualMissingNumbers);
    }
}
