import java.util.HashMap;

public class DuplicateEncoder {


    public static void main(String[] args) {
        System.out.println(encode("recede"));
    }
    //"recede"   =>  "()()()"

    static String encode(String word){

        HashMap<String,Integer> letters = new HashMap<>();
        String result = "";

        for(String s : word.toLowerCase().split("")){
            // letters.merge(s, 1, Integer::sum);
            Integer i = letters.get(s);
            if (i == null){
                letters.put(s,1);
            }else {
                letters.put(s,i+1);
            }
        }

        for (String s : word.toLowerCase().split("")){
            int i = letters.get(s);
            if(i > 1){
                result = result + ")";
            }else {
                result = result + "(";
            }
        }
        return result;
    }
}
