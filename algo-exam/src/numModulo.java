public class numModulo {
    public static void main(String[] args) {



    }

    public static class algorithm {
        public int algo(int number) {
            if(number < 0){
                return -1;
            }

            int sum = 0;
            for(int i=0; i < number; i++){

                if ((i%3==0) && (i%5==0)){
                    sum = sum + i;
                }
                else if((i%3==0) || (i%5==0)){
                    sum = sum + i;
                }
            }
            return sum;
        }
    }
}
