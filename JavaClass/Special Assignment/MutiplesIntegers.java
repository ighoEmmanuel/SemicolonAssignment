import java.util.Scanner;

  public class MutiplesIntegers{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
       System.out.print("Enter number:");
       double number = input.nextInt();
         
         if (number % 5 == 0){
     System.out.println(number + " is a Multiple of 5");
}else if (number % 5 != 0) {
     System.out.println(number + "is not a Multiple of 5");
}



}




}