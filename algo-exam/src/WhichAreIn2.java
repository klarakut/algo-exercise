import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhichAreIn2 {

    public static void main(String[] args) {

        /*
        a1 = ["arp", "live", "strong"]
        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
        returns ["arp", "live", "strong"]
         */
    }
    public static String[] inArray(String[] array1, String[] array2) {

        List<String> words = new ArrayList<>();
        for (String s1: array1){
            for (String s2: array2){
                if (s2.contains(s1)){
                    words.add(s1);
                    break;
                }
            }
        }
        Collections.sort(words);
        String[] result = new String[words.size()];
        for (int i =0; i < result.length; i++){
            result[i] = words.get(i);
        }
        return result;
    }
}
