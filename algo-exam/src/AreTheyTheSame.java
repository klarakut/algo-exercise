import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AreTheyTheSame {

    public static boolean comp(int[] a, int[] b) {
        if(a.length == 0 || b.length == 0){
            return false;
        }

        if(a.length != b.length){
            return false;
        }

        List<Integer> listA = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            int number = a[i];
            int n = number * number;
            listA.add(n);
        }

        List<Integer> listB = new ArrayList<>();
        for(int i = 0; i < b.length; i++){
            int number = b[i];
            listB.add(number);
        }

        Collections.sort(listA);
        Collections.sort(listB);

        for (int i = 0; i<a.length; i++){
            int n = listA.get(i);
            if( n != listB.get(i)){
                return false;
            }
        }
        return true;
    }
}
