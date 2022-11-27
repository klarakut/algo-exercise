public class rotation {
    public static void main(String[] args) {

    }

    public static int[] leftRotation(int[] a,int n, int k) {
        if( k >= n){
            k = k%n;
        }
        if( k == 0){
            return a;
        }

        int[] result = new int[n];

        for(int i =0; i <n; i++){
            if( i+k < n){
                result[i] = a[i+k];
            } else {
                result[i] = a[(i+k) -n];
            }
        }
        return result;
    }
}
