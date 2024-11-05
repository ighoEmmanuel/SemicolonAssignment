import java.util.Scanner;


public class Mutiple{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   System.out.println("Enter first number");
   

   int number1 = input.nextInt();

   
   System.out.println("Enter second number");
   int number2 = input.nextInt();



  int mutiple3 = number1 * 3;
  int mutiple2 = number2 * 2;


 if(mutiple3 % mutiple2 == 0){
    System.out.printf("your first number  %d triple is a mutiple of  your second number %d double ",number1,number2);
}else

      System.out.printf("\nyour first number %d triple is not a mutiple of your second number %d double ",number1,number2);



  



}

}
