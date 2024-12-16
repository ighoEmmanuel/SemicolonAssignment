import java.util.Scanner;
import java.util.HashMap;
public class DairyApp {
	public static void main(String[] args){
	Scanner scanner = new Scanner (System.in);

	HashMap<String,String> diaryEntries = new HashMap<>();
	System.out.println("Welcome to StoneCode Diary app\nWhere your secret is 100% safe!!");       	
	System.out.println("1. Create Diary");
        System.out.println("2. Lock Diary ");
        System.out.println("3. Unlock Diary");
        System.out.println("4. Add Entry");
        System.out.println("5. Find Entry by ID");
        System.out.println("6. Update Entry");
	System.out.println("7. Delete Entry");
        System.out.print("Enter your choice: ");
	int choice = scanner.nextInt();

	switch (choice) {
		case 1:
			scanner.nextLine();
			System.out.println("What would you like to name your diary(ID)");
			String input = scanner.nextLine();
			System.out.println("Like to add Password(yes/no)");
			String answer = scanner.nextLine();
			String password = "";
			while(answer.equalsIgnoreCase("yes")){
			System.out.println("create your Password");
			password = scanner.nextLine();
			System.out.println("Confirm your password");
			String passwordTwo = scanner.nextLine();
			if(passwordTwo.equalsIgnoreCase(password)){
				break;
			}else{
			System.out.println("Invalid password");
}

}
			System.out.println("Would you like to Enter your secret now (yes/no)");

			String option = scanner.nextLine();
			String secret = "";
			while(option.equalsIgnoreCase("yes")){
			System.out.println("Enter what you want");
			secret = scanner.nextLine();
			diaryEntries.put(input , secret);
			break;

}

		System.out.println("Diary Created!!!");
		break;

	case 2:
		scanner.nextLine();
		System.out.println("Enter diary(ID) name");
		String id = scanner.nextLine();
		for(String key : diaryEntries.keySet()){
		while(id == key){
		System.out.println("Enter password");
		String word = scanner.nextLine();
}
}
}
}

}