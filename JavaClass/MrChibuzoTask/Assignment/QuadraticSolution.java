import java.util.Scanner;
public class QuadraticSolution{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
      System.out.print("Enter a number:");
      double a = input.nextDouble();
       System.out.print("Enter b number:");
       double b = input.nextDouble();
       System.out.print("Enter c number:");
       double c = input.nextDouble();
       double root1 = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / 2 * a;
        double root2 = (-b - (Math.sqrt((b * b) - (4 * a * c)))) / 2 * a;
      System.out.print("The roots are " + root1 + " and "+ root2);
}


}