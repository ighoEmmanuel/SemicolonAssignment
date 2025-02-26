package classActivity;

import java.util.ArrayList;
import java.util.List;


public class ClassActivity {

    public  List<Integer> getMissingNumber(List<Integer> input) {
        List<Integer> result = new ArrayList<Integer>();
        input.sort(Integer::compareTo);
        for (int i = 0; i < input.size() - 1; i++) {
            int current = input.get(i);
            int next = input.get(i + 1);

            for (int num = current + 1; num < next; num++) {
                result.add(num);
            }
        }

        return result;
    }


}