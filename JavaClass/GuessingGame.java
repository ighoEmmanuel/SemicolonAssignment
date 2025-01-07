import java.util.Scanner;
 public class GuessingGame{
   public static void main(String[] args){
    Scanner s = new Scanner(System.in);
     System.out.print("Enter a number from 0-100 :");
     int number = s.nextInt();
     int random = 0;
    if (number == random ){
       System.out.print("Congratulation\nyou are correct");
}else if (number > random){
     System.out.print("Too high\ntry again!!!");
}else if(number < random){
     System.out.print("Too low\ntry again!!!");
}






}






}