import java.util.Scanner;

   public class IncresingDecreasingLoop {

   	public static void main(String[] args){
     		Scanner s = new Scanner(System.in);
    		int count;
     		double firstNumber;
		double secondNumber;
        	double thirdNumber;
        	count = 1;
   	do{
             System.out.print("Enter first number:");
       firstNumber = s.nextDouble();

       System.out.println("\nEnter secondNumber:");
          secondNumber = s.nextDouble();

       System.out.print("Enter third number :");
         thirdNumber = s.nextDouble();

     if (firstNumber > secondNumber && secondNumber > thirdNumber){
       System.out.print("decreasing order");
      }else if (firstNumber < secondNumber && secondNumber < thirdNumber){
              System.out.print("increasing order");
     }  else if (firstNumber == secondNumber && firstNumber == thirdNumber){
          System.out.print("All are Equal\ntry again!!");
    }else if (firstNumber > secondNumber && firstNumber < thirdNumber){
         System.out.print("They are not arrange \ntry again!!");

     }else if (firstNumber < secondNumber && secondNumber > thirdNumber){
       System.out.print("They are not arrange \ntry again!!");
      }else if(firstNumber > secondNumber && secondNumber < thirdNumber)
             System.out.print("They are not arrange \ntry again!!");
    
     count++;
     } while( count <= 3);
      


      

      
   }
}