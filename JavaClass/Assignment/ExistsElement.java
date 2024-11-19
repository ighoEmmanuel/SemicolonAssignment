import java.util.Arrays;

public class ExistsElement {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

     
        int elementToCheck = 0;

        int count = 0;

           for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToCheck) {
                count++;
                break;
            }
        }

        if (count > 0) {
            System.out.print("True");
        } else {
            System.out.println("False");
        }
    }
}
