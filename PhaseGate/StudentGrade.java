import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int students = scanner.nextInt();
        System.out.println("How many subjects do they offer?");
        int subjects = scanner.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
        score(students, subjects);
    }

    public static void score(int numbers, int subject) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[numbers][subject];

        for (int count = 0; count < numbers; count++) {
            System.out.println("Entering score for student " + (count + 1));
            for (int counter = 0; counter < subject; counter++) {
                System.out.println("Enter Score for subject " + (counter + 1));
                int score = scanner.nextInt();
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully");
                while (score > 100 || score < 0) {
                    System.out.println("Invalid Input. Please enter a number between (0 - 100):");
                    score = scanner.nextInt();
                    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println("Saved successfully");
                }
                scores[count][counter] = score;
            }
        }

        display();
        System.out.print("STUDENTS");
        for (int count = 0; count < subject; count++) {
            System.out.print("\t\tSUB " + (count + 1));
        }
        System.out.print("\t\tTOTAL\t\tAVE\t\tPOS");
        display();

        for (int count = 0; count < numbers; count++) {
            int total = 0;
            System.out.print("\nStudent " + (count + 1) + ":\t\t");
            for (int counter = 0; counter < subject; counter++) {
                System.out.print((scores[count][counter]) + "\t\t");
                total += scores[count][counter];
            }

            double average = (double) total / subject;
            System.out.printf("%-12s%.2f", total, average);
            int position = 1;

            for (int counts = 0; counts < numbers; counts++) {
                int otherTotal = 0;
                for (int counter = 0; counter < subject; counter++) {
                    otherTotal += scores[counts][counter];
                }
                if (otherTotal > total) {
                    position++;
                }
            }
            System.out.print("\t\t" + position);
        }

        display();
        System.out.print("\nSUBJECT SUMMARY");

        int hardestSubjectIndex = 0;
        int easiestSubjectIndex = 0;
        int maxFailures = 0;
        int maxPasses = 0;

        for (int counter = 0; counter < subject; counter++) {
            System.out.print("\nSub " + (counter + 1));
            int sum = 0;
            int largest = 0;
            int student = 0;
            int pass = 0;
            int failed = 0;
            int smallest = scores[0][counter];
            int smallestSubject = 0;

            for (int count = 0; count < scores.length; count++) {
                if (scores[count][counter] > largest) {
                    largest = scores[count][counter];
                    student = count;
                }
                if (scores[count][counter] < smallest) {
                    smallest = scores[count][counter];
                    smallestSubject = count;
                }
                sum += scores[count][counter];
                if (scores[count][counter] >= 50) {
                    pass++;
                } else {
                    failed++;
                }
            }

            System.out.print("\nThe highest score is: student " + (student + 1) + " scoring " + largest);
            System.out.print("\nThe Smallest is: student " + (smallestSubject + 1) + " scoring " + smallest);
            double average = (double) sum / numbers;
            System.out.print("\nTotal: " + sum);
            System.out.print("\nAverage score is: " + average);
            System.out.print("\nNumber of passes: " + pass);
            System.out.print("\nNumber of Fails: " + failed);

            // Update hardest and easiest subjects
            if (failed > maxFailures) {
                maxFailures = failed;
                hardestSubjectIndex = counter;
            }
            if (pass > maxPasses) {
                maxPasses = pass;
                easiestSubjectIndex = counter;
            }
        }

        System.out.print("\nThe hardest subject is Subject " + (hardestSubjectIndex + 1) + " with " + maxFailures + " failures");
        System.out.print("\nThe easiest subject is Subject " + (easiestSubjectIndex + 1) + " with " + maxPasses + " passes");
        System.out.println();
    }

    public static void display() {
        System.out.print("\n==============================================================================================================================================================================\n");
    
}
}
