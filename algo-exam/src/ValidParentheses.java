public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(validParentheses("(()))()()"));

    }
    public static boolean validParentheses(String parens)
    {
        int counter = 0;

        for (String s : parens.split("")){
            if(s.equals("(")){
                counter++;
            }
            if(s.equals(")")){
                counter--;
            }
            if (counter < 0){
                return false;
            }
        }
        if (counter == 0){
            return true;
        }
        return false;
    }
}
