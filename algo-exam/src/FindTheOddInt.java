import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheOddInt {

    public static int findIt(int[] a) {

        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i=0; i < a.length; i++){
            int num = a[i];
            int n = numbers.get(num);
            if(n == 0){
                numbers.put(num,1);
            } else {
                numbers.put(num, n + 1);
            }
        }

        //List<Integer> result = new ArrayList<>();
        int counter;
        List<Integer> oddNum = new ArrayList(numbers.values());
        for(Integer number : oddNum){
            if(number%2 != 0){
                for (Map.Entry<Integer,Integer> entry : numbers.entrySet()){
                    if(entry.getValue() == number){
                         counter = entry.getKey();
                         return counter;
                    }
                }
            }
        }
        return -1;

        /*
        old version:
           for(int i = 0; (i < a.length-1); i++){
      int number = a[i];
      int n = 1;

        for(int j = i+1; (j < a.length); j++){
          if(number == a[j]){
            n++;
          }
        }
        if( n%2 != 0 ){
          return a[i+1];
        }
    }
  	return -1;
  }
         */
    }
}
