import java.util.Scanner;

  public class Palindrome{
     public static void main(String[] args){
      Scanner input = new Scanner (System.in);
        System.out.print("Enter a 3-digit integer:");
        int number= input.nextInt();
        int num1 = number / 100;
        int num2 = number % 10;
 if (num1 == num2) {

    System.out.println( number + " is a palindrome ");


}else{
      System.out.println(  number + " is not a palindrome ");
}
  
}

}