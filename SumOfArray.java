public class SumArray{
 public static void main(String[] args) {
  int[] array = {11,21,31,41,52,};
  int length = array.length;
  int sum = 0;
  for(int i=0;i < length;i++) {
   sum = sum + array[i];
}
   System.out.println("sum of value of array : " + sum);
}
}