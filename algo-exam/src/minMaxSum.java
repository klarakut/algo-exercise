import java.util.Collections;
import java.util.List;

public class minMaxSum {

    public static void main(String[] args) {

        //System.out.println(miniMaxSum(););
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        //List<Integer> number = arr;
        Collections.sort(arr);
        int sumMin = 0;
        for(int i=0; i < arr.size()-1; i++){
            int num = arr.get(i);
            sumMin += num;
        }
        System.out.print(sumMin);

        int sumMax = 0;
        for(int i=1; i < arr.size(); i++){
            int num = arr.get(i);
            sumMax += num;
        }
        System.out.print(sumMax);
    }
}
