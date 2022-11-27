import java.util.HashMap;

public class algo2 {

    public static void main(String[] args) {

        int[] a = new int[3];
        a [0]=2;
        a [1]=2;
        a [2]=5;

        HashMap <Integer,Integer> aa = new HashMap<>();
        //aa.put(1);
        //if(aa.get(1))

        System.out.println(findIt(a));
    }

        public static int findIt(int[] a) {

            for(int i = 0; (i < a.length-1); i++){
                int number = a[i];
                int n = 1;

                for(int j = i+1; (j < a.length); j++){
                    if(number == a[j]){
                        n++;
                    }
                }
                if( n%2 != 0 ){
                    return a[i+1];
                }
            }
            return -1;
        }

}
