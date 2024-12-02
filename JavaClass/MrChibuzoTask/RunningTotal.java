public class RunningTotal {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        computeRunningTotal(numbers);
    }
    public static void computeRunningTotal(int[] numbers) {
        int total = 0; 
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            System.out.print(total + " ");
        }
    }


}
