package classActivity;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public List<Integer> getMultiplesOfTheLastInput(int beginning, int end, int divisor) {
        if(beginning < 0){
            throw new IllegalArgumentException("beginning is negative");
        }

        if(end < 0){
            throw new IllegalArgumentException("end is negative");
        }

        if(divisor < 0){
            throw new IllegalArgumentException("divisor is negative");
        }

        if(beginning > end){
            throw new IllegalArgumentException( "beginning is greater than end ");
        }

        List<Integer> factors = new ArrayList<Integer>();
        for(int count = beginning; count <= end; count++) {
            if(count % divisor == 0) {
                factors.add(count);
            }
        }
        return factors;
    }
}
