import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCandles {
    public static void main(String[] args) {

    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        /*

        /*Collections.sort(candles);
        int heighest = candles.get(candles.size()-1);
        int result = 0;
        for(int i =candles.size()-1; i >= 0; i--){
            if(candles.get(i) == heighest){
                result++;
            }
        }
        return result;
    }*/

        Map<Integer,Integer> numbers = new HashMap<>();

        for (int i = 0; i < candles.size(); i++){
            Integer number = candles.get(i);
            Integer count = numbers.get(number);

            if(count == 0){
                numbers.put(number,count);
            }else {
                numbers.put(number,count+1);
            }
        }

        /*List<Integer> n = new ArrayList<>(numbers.values());
        int highest = Collections.max(n);

        for (Map.Entry<Integer,Integer> m : numbers.entrySet()){
            if (m.getValue() == highest){
                result = m.getKey();
            }
        }*/
        int result = numbers.get(Collections.max(candles));
        return result;
    }
}
