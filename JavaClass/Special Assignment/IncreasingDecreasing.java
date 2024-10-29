import java.util.Scanner;

    public class IncreasingDecreasing{
      public static void main(String[] args){

         Scanner s = new Scanner(System.in);
       System.out.print("Enter first number:");
       double firstNumber = s.nextDouble();

       System.out.print("Enter secondNumber:");
         double secondNumber = s.nextDouble();

       System.out.print("Enter third number :");
         double thirdNumber = s.nextDouble();

       if (firstNumber > secondNumber && secondNumber > thirdNumber){

                  System.out.print("decreasing order");
}else {
     if (firstNumber < secondNumber && secondNumber < thirdNumber){

              System.out.print("increasing order");
}else{
     if (firstNumber == secondNumber && firstNumber == thirdNumber){
          System.out.print("All are Equal\ntry again!!");

}else {
     if (firstNumber > secondNumber && firstNumber < thirdNumber){
         System.out.print("They are not arrange \ntry again!!");
}else{
     if (firstNumber < secondNumber && secondNumber > thirdNumber){
       System.out.print("They are not arrange \ntry again!!");
}

}

}

}

}


}




}