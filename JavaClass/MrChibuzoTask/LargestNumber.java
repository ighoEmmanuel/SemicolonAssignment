public class LargestNumber {
	public static void main(String[] args){
	largestNumberInArray(new int[]{1, 2, 3, 4, 5});

}

public static void largestNumberInArray(int[] number){
	int largest = number[0]; 
	for(int count :number){
	if(count > largest) largest = count;
   }
	System.out.println("The largest number:" + largest);	
}

}