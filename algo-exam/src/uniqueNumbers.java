import java.util.HashMap;
import java.util.Map;

public class uniqueNumbers {

    public static void main(String[] args) {

        System.out.println(findUniq(new double[]{ 0, 1, 0.55, 0, 0 }));
    }

    public static double findUniq(double arr[]) {
        // Do the magic

        Map<Double, Integer> numbers = new HashMap<>();

        for(int i = 0; i< arr.length; i++){
            double num = arr[i];
            Integer count = numbers.get(num);
            if(count == null){
                numbers.put(num,1);
            } else{
                numbers.put(num, count + 1);
            }
        }

            for (Map.Entry<Double,Integer> entry : numbers.entrySet()) {
                if (entry.getValue().equals(1)) {
                    return entry.getKey();
                }
            }
        return -1;
    }
}
