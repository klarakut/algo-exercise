public class CalculateStringRotation {

    public static void main(String[] args) {

    }

    //"coffee", "eecoff" => 2

    static int shiftedDiff(String first, String second){

        String s = first.substring(2);
        int s1 = second.indexOf(s);

        String p = first.substring(3);
        int p1 = second.indexOf(p);

        if(p1 == (s1+1)){
            return Math.abs(s1 - 2);
        }
        //int c = (p - 2);

        String r = "";
        for (int i = 0; i < second.length(); i++){
            String letter = Character.toString(first.charAt(i));
            //r = r +
        }
        //int result = Math.abs(p - 2);

        /*List<Integer> numbers = new ArrayList<>();
        for(int i=0; i < first.length(); i++){
            char ch = first.charAt(i);
            int index = second.indexOf(ch);
            numbers.add(index);
        }

        if(numbers.get(1) == (numbers.get(0) + 1)){

            int result = Math.abs(numbers.get(0) - 0);
            return result;
        }*/
        return -1;
    }
}
