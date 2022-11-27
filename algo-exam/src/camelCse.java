public class camelCse {

    public static void main(String[] args) {

        String s = "camelCaseCamel";
        String m = "";
        System.out.println(camelCse(s));
        System.out.println(camelCse(m));
    }

    public static String camelCse(String s) {

        if(s.length() == 0){
            return "-1";
        }
        String letter = s.charAt(0)+"";
        String result = letter;
        for(int i= 1; i < s.length(); i++){
            letter = s.charAt(i)+"";
            if(!letter.equals(letter.toString().toLowerCase())){
            //if(letter != letter.toString().toLowerCase()){
                    result = result + " " + letter;
                }else {
                    result += letter;
                }
            }
        return result;
    }
}
