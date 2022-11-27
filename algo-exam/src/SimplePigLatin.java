public class SimplePigLatin {

    public static void main(String[] args) {

    }

    public static String pigIt(String str) {

        String result = "";
        for (String s : str.split(" ")){
            String character = Character.toString(s.charAt(0));
            String newWord = s.substring(1) + character + "ay";
            result = newWord + " ";
        }

        result.trim();
        result = result.substring(0,result.length()-1);
        return result;
    }
}
