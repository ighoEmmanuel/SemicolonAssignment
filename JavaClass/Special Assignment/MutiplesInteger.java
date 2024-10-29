import java.util.Scanner;
 public class MutiplesInteger{
    public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     int counter = 1;
      int number ;
    while ( counter <= 3){

          System.out.println("Enter number:");
           number = s.nextInt();

     int num = 0;
       if ( number % 5 == 0){
        System.out.println("Multiple of 5");
} else if (number % 5 != 0){
    System.out.print("not a Multiple of 5");
}


   counter++;
}



}






}