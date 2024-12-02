public class ElementChecker {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
	System.out.print(getElement(numbers,3));

}

    public static boolean getElement(int[] numbers, int number) {
            for (int count = 0; count < numbers.length; count++) {
                if (numbers[count] == number) {
                    return true;
                }
            }
            return false; 

    }
}
