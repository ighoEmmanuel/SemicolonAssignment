import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade {
	public static void main(String[] args) {
	input();
}
public static void input(){
Scanner scanner = new Scanner(System.in);
 System.out.println("How many students do you have?");
 int students = scanner.nextInt();
 int[] student = new int[students];
 for(int count = 0; count < students ; count++){
	student[count] = count + 1;
 }	
	 System.out.println(Arrays.toString(student));
  }
}