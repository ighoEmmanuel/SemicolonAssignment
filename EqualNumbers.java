import java.util.Scanner;
public class EqualNumbers{

  public static void main(String[] args){
   
     Scanner input = new Scanner(System.in);

    System.out.print("Enter first number:");
    double firstNumber = input.nextDouble();
    
 System.out.print("Enter second number:");
     double secondNumber = input.nextDouble();

      System.out.print("Enter third number:");
     double thirdNumber = input.nextDouble();


   if(firstNumber == secondNumber && firstNumber == thirdNumber){
        System.out.print("All numbers are equal");


}else{
      if (firstNumber != secondNumber && firstNumber != thirdNumber){
       System.out.print("All numbers are not equal");

}else{
     if(firstNumber == secondNumber && firstNumber != thirdNumber){
           System.out.print("All numbers are not equal");
}else{
    if(firstNumber != secondNumber && firstNumber == thirdNumber){
       System.out.print("All numbers are not equal");
}

}


}

} 
     




}




}