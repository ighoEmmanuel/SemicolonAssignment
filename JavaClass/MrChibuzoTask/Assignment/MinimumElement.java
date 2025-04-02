public class MinimumElement{
 	public static void main(String[] args) {
 		int[] number = {19, 0, 13, 4, 55};
  		int minimum = number[0]; 
  		for(int i = 1; i < number.length; i++){
  			if (number[i] < minimum)
  				minimum = number[i];
  } 
  		System.out.println("minimum number is:" + minimum);


}
}