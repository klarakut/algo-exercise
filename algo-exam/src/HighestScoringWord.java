import java.util.HashMap;
import java.util.Map;

public class HighestScoringWord {
    public static void main(String[] args) {

        System.out.println(high(("b aa")));
    }

    public static String high(String s) {
        Map<Character, Integer> alpha = new HashMap<>();
        Character ch = 'a';

        for (int i=0; i < 26; i++){
            alpha.put(ch,i+1);
            ch++;
        }

        Map<String,Integer> words = new HashMap<>();

        String result = "";
        int score = 0;
        for (String word : s.split(" ")){
            Integer counter = 0;
            for (int i =0; i<word.length(); i++){
                Character character = word.charAt(i);
                Integer num = alpha.get(character);
                counter += num;
            }
            words.put(word,counter);

            if(counter > score){
                score = counter;
                result = word;
            }
        }

       /* List<Integer> numbers = new ArrayList<>(words.values());
        int highest  = 2;

        //List<String> w = new ArrayList<>();

        /*for (Map.Entry<String ,Integer> entry : words.entrySet()) {
            if (entry.getValue().equals(highest)) {
                w.add(entry.getKey());
            }
        }*/
        /*for (String str : words.keySet()) {
            if (words.get(str) == highest) {
                return str;
            }
        }*/
            return result;
    }
}
