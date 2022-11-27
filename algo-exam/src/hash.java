public class hash {
    public static void main(String[] args) {

        String s = "abc#d####";
        System.out.println(cleanString(s));

    }

    public static String cleanString(String s) {
        //String word = s;
        String result = "";

        for(int i= 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '#'){
                int n = result.length();
                result = result.substring(0,n-1);
            }else {
                result += c;
            }
        }
        return result;
    }
}
