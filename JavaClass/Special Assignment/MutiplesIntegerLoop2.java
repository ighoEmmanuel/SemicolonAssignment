import java.util.Scanner;
 public class MutiplesIntegerLoop2{
    public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     int sentinel = 0;
      int number ;
    do{
         System.out.print("\nEnter number:");
           number = s.nextInt();

       if ( number % 5 == 0){
        System.out.println(number + " is a Multiple of 5");
} else if (number % 5 != 0){
    System.out.print(number +" is not a Multiple of 5");
}

   System.out.print("\nDo you wish to continue (press 1 to continue and press 0 to end):");
    sentinel = s.nextInt();
  
}while (sentinel != 0);



}






}