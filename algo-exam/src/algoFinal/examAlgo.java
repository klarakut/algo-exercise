package algoFinal;

import java.util.HashMap;
import java.util.Map;

public class examAlgo {
    public static void main(String[] args) {


        /*
        32. Isogram

Create a function called isogram that takes a string as an input and returns a boolean value whether a string is a isogram or not. Rules are as follows:

the comparison is case-insensitive: "a" DOES EQUAL "A"
the space is not considered as a character (it is ignored)
string has to be at least one character long, otherwise the result is by DEFAULT "false"
Isogram is a word or a phrase in which no letter of the alphabet occurs more than once ("Evan" is isogram, "carrot" is NOT isogram)

Example cases:

isogram("Readily");
Should return "true"

isogram("UNCOPYRIGHTABLE");
Should return "true"

isogram("He is moral");
Should return "true"

         */
        String s = "";
        String ss = null;
        System.out.println(giveMeAnswer(ss));

    }

    public static boolean giveMeAnswer(String s){

         if(s.length() == 0 || s.equals(null)){
             return false;
         }

        Map<String,Integer> letters = new HashMap<>();
        String word = "";

        for (String str : s.split(" ")){
            word += str;
        }

        for(int i =0; i < word.length(); i++){
            String l = word.charAt(i) + "";
            l = l.toLowerCase();
            letters.put(l, letters.get(l) == null ? 1 : letters.get(l) +1);
            if(letters.get(l) > 1){
                return false;
            }
        }
        return true;
    }
}
