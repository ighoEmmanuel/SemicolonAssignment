import java.util.Scanner;

   public class IncresingDecreasingLoop2 {

   	public static void main(String[] args){
     		Scanner s = new Scanner(System.in);
    		int  sentinel;
     		double firstNumber;
		double secondNumber;
        	double thirdNumber;
        	 sentinel = 0;
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
      

    
     System.out.print("\nDo you wish to continue?? if yes press 1,if no press 0:");
    sentinel = s.nextInt();
     } while(  sentinel != 0);
      

      

      
   }
}