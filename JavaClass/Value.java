
import java.util.Scanner;

 public class Value{
     public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number:");
    int number1 = input.nextInt();
    System.out.print("Enter second number:");
    int number2 = input.nextInt();
    System.out.print("Enter third number:");
    int number3 = input.nextInt();
    System.out.print("Enter fourth number:");
    int number4 = input.nextInt();
    System.out.print("Enter fifth number :");
    int number5 = input.nextInt();
    int positive = 0; 
    int negative = 0;
    int zero = 0;
 
       if (number1 > 0) {
       positive = positive +1;
}
 else if (number1 < 0) {
   negative = negative +1;   
}
 else if  (number1 == 0) {
    zero = zero +1;
} 
      if (number2 > 0){
      positive =positive +1;
}
else if (number2 < 0){
      negative = negative +1;
}
else if (number2 <= 0){
    zero = zero +1;
}
      if (number3 > 0){
    positive = positive +1;
}
 else if (number3 < 0){
     negative = negative +1;
}
 else if (number3 <= 0)
     zero = zero +1;
     
    if (number4 > 0){
   positive = positive +1;
}else
      if (number4 < 0){
    negative = negative +1;
}else
     if (number4 <= 0){
   zero = zero +1;
}
     if (number5 > 0){
    positive = positive +1;
}else
   if (number5 < 0){
    negative = negative +1;
}else
    if (number5 <= 0){
   zero = zero +1;
}

           System.out.printf("number of positive: %d%nnumber of negative: %d%nnumber of zeros value: %d", positive, negative, zero);
  }
}   
