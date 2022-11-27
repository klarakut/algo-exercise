public class SeparateWheat {
    public static void main(String[] args) {


        long[] arr = new long[] { 6,-6,3, -4, 6, 2, -2,5 };
        wheatFromChaff(arr);

    }

    public static long[] wheatFromChaff(long[] values) {

        /*if(values.length ==0){
            return
        }*/

        for (int i =0; i < values.length; i++){
            if (values[i] > 0){
                for (int j = values.length-1; i <= j ; j--){
                    if (values[j] <= 0){
                        long m = values[i];
                        values[i] = values[j];
                        values[j] = m;
                        break;
                    }
                }
            }
        }
        return values;
    }
}
