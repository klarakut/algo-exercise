public class Duplicates_WhichAreIn {

    public static void main(String[] args) {
        // a1 = ["arp", "live", "strong"]
        // a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
        // returns ["arp", "live", "strong"]


    }

    public static String[] inArray(String[] array1, String[] array2) {
        String [] newArr = new String [array1.length];
        String [] empty= new String [0];


        for (String s : array1){
            String word = s;

            for (String second : array2){
                if(second.contains(word)){
                    //newArr[] = word;
                }
            }

        }


        return new String[] { "arp" };
    }
}
