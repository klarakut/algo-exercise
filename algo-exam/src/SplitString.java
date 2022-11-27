import java.util.ArrayList;
import java.util.List;

public class SplitString {
            //* 'abc' =>  ['ab', 'c_']
            //* 'abcdef' => ['ab', 'cd', 'ef']
    public static String[] solution(String s) {

        int l = (s.length()%2 == 0) ? (s.length()/2) : (s.length()/2 +1);
        String[] result = new String[l];

        List<String> letters = new ArrayList<>();
        for (String str : s.split("")){
            letters.add(str);
        }
        List<String> words = new ArrayList<>();

        if(s.length()%2 == 0){
            for (int i=0;  i < s.length()-1; i+=2){
                String word = letters.get(i) + letters.get(i+1);
                words.add(word);
            }

            for (int i =0; i < words.size(); i++){
                result[i] = words.get(i);
            }
            return result;

        }else {
            String ww = letters.get(letters.size() - 1) + "_";
            result[result.length - 1] = ww;
            for (int i = 0; i < s.length() - 2; i += 2) {
                String word = letters.get(i) + letters.get(i + 1);
                words.add(word);
            }

            for (int i =0; i < words.size(); i++){
                result[i] = words.get(i);
            }
            return result;
        }
    }
}
