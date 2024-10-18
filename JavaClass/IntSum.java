import java.util.Scanner;

  public class  IntSum{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number:");
    int number1 =input.nextInt();
    int num1 = number1 / 100;
    int reminder = number1 % 100;
    int num2 = reminder / 10;
    
    int num3 = reminder % 10; 
    int sum = num1 + num2 + num3;
   System.out.printf("The sum of the digit is %d",sum);



}

}