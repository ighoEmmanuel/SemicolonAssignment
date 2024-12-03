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
	score(students, subjects);
	
}

public static void score(int numbers, int subject){
 Scanner scanner = new Scanner(System.in);
 int[][] scores = new int[numbers][subject];
 for(int count = 0; count < numbers ;count++){
	System.out.println("Entering score for student " + (count + 1));
	for(int counter = 0 ; counter < subject ; counter++){
		System.out.println("Enter Score for subject " + (counter + 1));
		int score = scanner.nextInt();
		while (score > 100 || score < 0){
			System.out.println("Invalid Input please enter number between(0 - 100)");
			score = scanner.nextInt();
}
	scores[counter][count] = score;
			}
}
	display();
	for (int count = 0; count < numbers;count++){
		System.out.print("\nStudent " + (count + 1) + ":\t\t");
		for (int counter = 0;counter < subject ;counter++){
			System.out.print(scores[counter][count]  + "\t\t");
		}
		System.out.println();
}
	display();
	}
public static void display(){
	System.out.println("=======================================================================================");

	
}
}	