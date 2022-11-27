public class FoldAnArray {

    public static int[] foldArray(int[] array, int runs) {

        if(array.length == 1){
            return  array;
        }


        /*for(int j =0; j<runs; j++){
            int center = array.length%2==0?array.length/2:array.length/2+1;
            int[] newArray= new int[center];
            for(int i=0; i<center; i++){
                newArray[i] = array[i]+array[array.length-i-1];
                if(i==array.length-i-1) newArray[i]= array[center-1];
            }
            array = newArray;
        }
        return array;*/

        //int [] arr;
        for(int r =0; r < runs; r++) {
            //int center = array.length%2 == 0 ? array.length/2 : array.length/2 + 1;
            int [] arr;
            if (array.length % 2 == 0) {
                    int x = array.length / 2;
                    arr = new int[x];
                    for (int i = 0; i < x; i++) {
                        arr[i] = array[i] + array[array.length - 1 - i];
                    }
            } else {
                int m = (array.length / 2);
                    arr = new int[m + 1];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = array[i] + array[array.length - 1 - i];
                        if(i == array.length-i-1) arr[i]= array[m];
                    }
            }
            array = arr;
       }
        return array;
    }
}
