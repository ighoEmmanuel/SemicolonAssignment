import java.util.Scanner;

    public class DivisibleLoop2{
      public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sentinel = 0;
         int num;
     do{
              System.out.println("\nEnter number:");
      num = s.nextInt();
     if (num % 5 == 0 && num % 11 == 0){
        System.out.print(num + " is divisiable by 5 and 11");

}else if (num % 5 == 0 && num % 11 != 0){
    
    System.out.print(num + " is not divisiable by 5 and 11\ntry again!!");

}else if (num % 5 != 0 && num % 11 == 0) {
   System.out.print(num + " is not divisiable by 5 and 11\ntry again!!");
}else if (num % 5 != 0 && num % 11 != 0) {
   System.out.print(num + " is not divisiable by 5 and 11\ntry again!!");
}
  

System.out.println("Do you wish to continue (press 1 to continue and 0 to stop):");
   sentinel  = s.nextInt();

}while ( sentinel != 0);
   

 

}


}