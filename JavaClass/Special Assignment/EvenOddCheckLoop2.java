import java.util.Scanner;

        public class EvenOddCheckLoop2{
        public static void main(String[] args){
         Scanner s = new Scanner(System.in);
      double num;
      int sentinel = 0;
 do{
       System.out.print("Enter number:");
         num = s.nextDouble();
      if (num % 2 == 0) {
          System.out.println( num + " is even");
}else if (num % 2 != 0){
         System.out.println( num + " is odd ");
}
   System.out.print("\nDo you wish to continue? if yes enter 1 ,if no enter 0:");
   sentinel = s.nextInt();
  } while(sentinel != 0 );   
        





}





}