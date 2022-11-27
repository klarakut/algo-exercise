public class TimeConversion {

    public static String timeConversion(String s) {

        //07:05:45PM

        String end = s.substring(8);

        if(end.equals("AM")){
            if(s.substring(0,2).equals("12")){
                return "00" + s.substring(2,8);
            }else {
                return s.substring(0,8);
            }
        }

        if (s.substring(0,2).equals("12")){
            return s.substring(0,8);
        }
        Integer i = Integer.parseInt(s.substring(0,2)) + 12;
        //String num = i + "";
        return i + s.substring(2,8);
    }
}
