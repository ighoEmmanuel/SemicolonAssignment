public class ReverseArray {
	public static void main(String[] args){
	reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});

}

public static void reverseArray(int[] number){
	for(int count = (number.length -1);count > -1; count--){
		 System.out.print(number[count] + "  " );

   }
}

}