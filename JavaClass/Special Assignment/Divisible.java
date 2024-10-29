import java.util.Scanner;
    public class Divisible{
     public static void main(String[] args){
       Scanner s = new Scanner(System.in);
      System.out.print("Enter number:");
     int num = s.nextInt();
     if (num % 5 == 0 && num % 11 == 0){
        System.out.print(num + " is divisiable by 5 and 11");

}else if (num % 5 == 0 && num % 11 != 0){
    
    System.out.print(num + " is not divisiable by 5 and 11\ntry again!!");

}else if (num % 5 != 0 && num % 11 == 0) {
   System.out.print(num + " is not divisiable by 5 and 11\ntry again!!");
}else if (num % 5 != 0 && num % 11 != 0) {
   System.out.print(num + " is not divisiable by 5 and 11\ntry again!!");
}




}





}