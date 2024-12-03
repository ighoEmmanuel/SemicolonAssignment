import java.util.Scanner;
public class StudentGrade {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 System.out.println("How many students do you have?");
 		int students = scanner.nextInt();
	 System.out.println("How many subject do they offer?");
 		int subjects = scanner.nextInt();
System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("Saved successfully");
	score(students,subjects);
}

public static void score(int numbersOfStudents, int subjectOffered){
 Scanner scanner = new Scanner(System.in);
 int total = 0;
 int[][] scores = new int[numbersOfStudents][subjectOffered];
 for(int count = 0; count < numbersOfStudents;count++){
	System.out.println("Entering score for student " + (count + 1));
	for(int counter = 0; counter < subjectOffered; counter++){
		System.out.println("Entering Score for subject " + (counter + 1));
		int score = scanner.nextInt();
		total += score;
		System.out.println("Saving >>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");

       	   }
       }
double average = total / 2; System.out.println("==========================================================================");
System.out.println("STUDENT\t\tSUB 1\tSUB 2\tSUB 3\t\tTOT\t\tAVE\t\tPOS");
//System.out.println("Student 1\t\t

 }

}