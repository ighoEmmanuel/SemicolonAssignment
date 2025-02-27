import java.util.Scanner;
  public class SumsOfNatural{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter natural number:");
    double number = input.nextDouble();
    double first = (number / 100);
    double second = number % 10;
    double reminder = number / 100;
     double third  = reminder /10;
   double add = first + second + third;



     System.out.println("Sum of the numbers :" + add);








}

}