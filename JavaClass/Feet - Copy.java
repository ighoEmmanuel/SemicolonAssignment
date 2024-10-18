import java.util.Scanner;

public class Feet{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
    System.out.print("Enter number in Feet:");
    double feet = input.nextDouble();
    double result = feet * 0.305;
    System.out.println("converted to meters:" + result);

}


}