import java.util.Scanner;

   public class WeightPounds{
      public static void main(String[] args){
       Scanner input = new Scanner(System.in);
     System.out.print("Enter number in weight:");
     int weight = input.nextInt();
     System.out.print("Enter number in height:");
       int height = input.nextInt();
     float BMI = weight * 703;
     float BMI1 = height * height;
     float BMI2 = BMI / BMI1;
     System.out.printf("BMI is :%f", BMI2);
     
     

}

}