import java.util.*;

public class LongestConsecutiveRepetition {
            // aaabb
    public static Object[] longestRepetition(String s) {
        if(s.length() == 0){
            return new Object[]{"", 0};
        }
        if(s.length() == 1){
            return new Object[]{s, 1};
        }
        Map<String,Integer> words = new HashMap<>();
        String word = "";

        for(int i =0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                String letter = Character.toString(s.charAt(i));
                word = word + letter;
            } else {
                String letter = Character.toString(s.charAt(i));
                word = word + letter;
                //String letter = Character.toString(s.charAt(i));
                words.put(letter,word.length());
                s = s.substring(i+1);
                word="";
                i=-1;
            }
        }
        List<Integer> count = new ArrayList<>(words.values());
        int maxCount = Collections.max(count);
        String result = "";

        for(Map.Entry<String,Integer> entry : words.entrySet()){
            if (entry.getValue() == maxCount){
                result = entry.getKey();
            }
        }
        return new Object[]{result, maxCount};
    }
}
