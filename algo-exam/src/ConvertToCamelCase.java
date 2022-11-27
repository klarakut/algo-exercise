import java.util.ArrayList;
import java.util.List;

public class ConvertToCamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

    //"the-stealth-warrior"
    //"The_Stealth_Warrior"
    static String toCamelCase(String s){

        String result = "";
        List<String> words = new ArrayList<>();
        if(s.contains("-")){

            for (String str : s.split("-")){
                words.add(str);
            }
            result = result+words.get(0);
            for (int i =1; i <words.size();i++){
                String w = words.get(i);
                String letter = (w.charAt(0)+"").toUpperCase();
                result = result+ letter+ w.substring(1);
            }
            return result;
        }
        if(s.contains("_")){
            for (String str : s.split("_")){
                result=result + str;
            }
        }
        return result;
    }
}
