public class StrongPassword {

    public static int minimumNumber(int n, String password) {

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        int missing = 4;

        for (String s : numbers.split("")) {
            if (password.contains(s)) {
                missing--;
                break;
            }
        }

        for (String s : lower_case.split("")) {
            if (password.contains(s)) {
                missing--;
                break;
            }
        }

        for (String s : upper_case.split("")) {
            if (password.contains(s)) {
                missing--;
                break;
            }
        }

        for (String s : special_characters.split("")) {
            if (password.contains(s)) {
                missing--;
                break;
            }
        }


        if (n < 6) {
            int m = (6 - n);
            if (missing < m) {
                return m;
            }
        }
        return missing;
    }
}
