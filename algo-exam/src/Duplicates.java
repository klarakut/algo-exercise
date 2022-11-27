import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {

    public static void main(String[] args) {

        String word = "Helo";
        System.out.println(duplicateCount(word));
    }
    public static int duplicateCount(String text) {
    int count = 0;
    String w = text.toLowerCase();
    Map<Character,Integer> numbers = new HashMap<>();

    for(int i=0; i< text.length(); i++){
        Character ch = w.charAt(i);
        Integer m = numbers.get(ch);

        if(m == null){
            numbers.put(ch,1);
        } else{
            numbers.put(ch, m + 1);
        }
    }
    List<Integer> values = new ArrayList<>(numbers.values());
    for (Integer n : values){
        if(n > 1){
            count ++;
        }
    }
    return count;
    }
}
