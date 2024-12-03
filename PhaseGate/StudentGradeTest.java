import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentGradeTest {
    @Test
    public void testScoreExists() {
        boolean[] expected = {true};
        boolean[] actual = {StudentGrade.scoreExists(StudentGradeTest.class, "methodExists")};

        assertArrayEquals(expected, actual, "The method should exist in MethodUtils class!");
    }
}
	