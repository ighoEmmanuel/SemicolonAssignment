import java.util.Scanner;

public class BarsChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 1;
        String z = *;
        while (a <= 5)
             a++;{
            System.out.print("Enter a number between 1 and 30: ");
            int number = input.nextInt();
            
            while (number < 1 || number > 30) {
                System.out.print("Invalid input. Enter a number between 1 and 30: ");
                number = input.nextInt();
            }
            
            System.out.println("Number: " + number);
            while ( b <= number)

                     b++;{
                System.out.println("*" *number  );
            }
            System.out.println("\n");
        }
    }
}
