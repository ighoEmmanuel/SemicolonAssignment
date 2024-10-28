import java.util.Scanner;

public class ProductCaculator{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter first number:");
    double firstNumber = input.nextDouble();
  System.out.print("Enter second number:");
   double secondNumber = input.nextDouble();
  double product = Math.pow(firstNumber,secondNumber);

   System.out.print(product);

}


}