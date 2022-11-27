public class exerciseFrog {

    public static void main(String[] args) {

        int[] a = new int[4];
        a [0]=-1;
        a [1]=2;
        a [2]=1;
        a [3]=5;

        int x =0;
        int count = 0;
        for (int i =0; (i< a.length); i = x){
            x = i + a[i];

            if (x < a.length || x < 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
