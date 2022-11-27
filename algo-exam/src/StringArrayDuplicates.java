public class StringArrayDuplicates {
    public static void main(String[] args) {

        //dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"]
        String[] a = new String[] {"abbbracadabra","allottee","assessee"};
        dup(a);
    }

    public static String[] dup(String[] arr){

        String[] result = new String[arr.length];
        String newWord = "";

        for (int j =0; j < arr.length; j++){
            String s = arr[j];
                for (int i=1; i < s.length(); i++){
                    if(s.charAt(i) == s.charAt(i-1)){
                        s = s.substring(i);
                        i = 0;
                    } else {
                        newWord = newWord+s.charAt(i-1);
                        s = s.substring(i);
                        i = 0;
                        if(s.length() == 1){
                            newWord += s.charAt(0);
                            break;
                        }
                    }
                }
            result[j] = newWord;
        }
        return result;
        /*for (int j =0; j < arr.length; j++){
            String word = arr[j];
            for (int i = 1; i < arr.length; i++){
                newWord = Character.toString(word.charAt(0));
                String ch = Character.toString(word.charAt(i));
                if(word.charAt(i) != word.charAt(i-1)){
                    newWord = newWord + ch;
                }
            }
            result[j] = newWord;
        }
        return result;*/
    }
}
