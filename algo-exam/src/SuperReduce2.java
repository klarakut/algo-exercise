public class SuperReduce2 {

    public static String superReducedString(String s) {


        //abaab

        String word = "";

        for(int i=0; i <s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1) && s.length()==2){
                return "Empty String";
            }
            if(s.charAt(i) == s.charAt(i+1)){
                s = s.substring(0,i) + s.substring(i+2);
                i=-1;
            }
        }
        return s;
    }
}
