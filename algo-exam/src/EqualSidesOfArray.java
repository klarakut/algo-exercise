import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EqualSidesOfArray {

    //{20,10,-80,10,10,15,35}
    public static int findEvenIndex(int[] arr) {

        List<Integer> numbers = new ArrayList<>();

        for (int i =0; i < arr.length; i++){
            numbers.add(arr[i]);
        }
        int maxValue = Collections.max(numbers);
        int n = numbers.indexOf(maxValue);

        int countRight =0;
        for (int m =0; m<n; m++){
            countRight = countRight + numbers.get(m);
        }

        int countLeft =0;
        for (int o =numbers.size()-1; o>n; o--){
            countLeft = countLeft + numbers.get(o);
        }

        //if ()
        return -1;
    }
}
