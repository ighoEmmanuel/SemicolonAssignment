import java.util.Scanner;

        public class EvenOddCheckLoop{
        public static void main(String[] args){
         Scanner s = new Scanner(System.in);
      double num;
      int count = 1;
 do{
       System.out.print("Enter number:");
         num = s.nextDouble();
      if (num % 2 == 0) {
          System.out.println( num + " is even");
}else if (num % 2 != 0){
         System.out.println( num + " is odd ");
}
   count++;
  } while(count <= 3);   
        





}





}