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
	scores[count][counter] = score;
			}
}
	for (int count = 0 ; count < subject ; count++){
		System.out.print("\t\t\tSUB " + (count + 1));
}
	System.out.print("\t\tTOTAL\t\tAVE\t\tPOS");
	for (int count = 0; count < numbers;count++){
		int total = 0;
		System.out.print("\nStudent " + (count + 1) + ":\t\t");
		for (int counter = 0;counter < subject ;counter++){
			System.out.print((scores[count][counter])  + "\t\t\t");
		total = total + scores[count][counter];
		
		}

		double average = (double)total / subject;
		System.out.printf("%-12s%.2f",total,average);
	int position = 1;
	for (int counts = 0; counts < numbers;counts++){
		int otherTotal = 0;
		for(int counter = 0; counter < subject;counter++){
			otherTotal += scores[counts][counter];
	}
		if(otherTotal > total){
			position++;
	}
	System.out.print("\t" + position);
	
}


}
}
}