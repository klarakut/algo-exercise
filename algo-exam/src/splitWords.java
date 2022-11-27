import java.util.ArrayList;
import java.util.List;

public class splitWords {

    public static void main(String[] args) {

        String s = "is2 Thi1s T4est 3a";
        System.out.println(splitWords(s));

        String ss = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(splitWords(ss));

        String sss = "Fo1r";
        System.out.println(splitWords(sss));
    }

    public static String splitWords(String s) {

        if(s.length() == 0){
            return "-1";
        }

        String result = "";
        List<String> words = new ArrayList<>();
        for(String word : s.split(" ")){
            words.add(word);
        }

        if(words.size() == 1){
            return words.get(0);
        }

       /* for(int i =1; i < words.size(); i++){
            String m = i+"";
            for (String word : words){
                if ((m.equals("1"))){
                    if(word.contains(m))
                    result += result;
                } else if ((word.contains(m)){
                    result = result + " " + word;
                }
            }
        }*/

        /*for(int i = words.size() - 1; i >=0; i--){
            String m = i+"";
            for (String word : words){
                if(word.contains(m)){
                    result = word + " " + result;
                }
            }
        }*/


        return result;
    }
}
