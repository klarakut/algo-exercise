public class OrderPlease {


    //"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
    public static String order(String s) {

        String result = "";

        if (s.length() == 0){
            return "";
        }
        if(s.length() == 1){
            return s;
        }

        for(int i = s.length(); i > 0; i--){
            String num = i +"";
            for (String str : s.split(" ")){
                if(str.contains(num)){
                    result = str + " " + result;
                }
            }
        }
        result = result.trim();
        return result;

        //old:

        /*if(s.length() == 0){
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

        for(int i = words.size() - 1; i >=0; i--){
            String m = i+"";
            for (String word : words){
                if(word.contains(m)){
                    result = word + " " + result;
                }
            }
        }
        return result;*/
    }
}
