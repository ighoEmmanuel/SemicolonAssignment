import java.util.List; 
public class OddPosition{ 
	public static void main(String[] args) { 
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); printOddPositionElements(numbers); 
} 
public static void printOddPositionElements(List<Integer> list) { 
	System.out.println("Elements at odd positions:"); 
	for (int i = 1; i < list.size(); i += 2) { 
	System.out.println(list.get(i)); 
}
 }
 }