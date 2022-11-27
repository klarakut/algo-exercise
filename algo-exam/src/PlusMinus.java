import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        double positive = 0L;
        double negative = 0L;
        double neutral = 0l;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                neutral++;
            }
        }

        double p = positive/arr.size();
        double n = negative/arr.size();
        double neu = neutral/arr.size();

        System.out.println(String.format("%6f",p));
        System.out.println(String.format("%6f",n));
        System.out.println(String.format("%6f",neu));
    }
}
