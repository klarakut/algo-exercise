import java.util.ArrayList;
import java.util.List;

public class StreetFighters {

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){

        String[] result = new String[moves.length];

        List<String> l = new ArrayList<>();

        for (String move : moves){
            if(move.equals("up")){
                if(position[0] == 0){
                    l.add(fighters[position[0]][position[1]]);
                } else {
                    position[0] = position[0] - 1;
                    l.add(fighters[position[0]][position[1]]);
                }
            }

            if(move.equals("down")){
                if(position[0] == (fighters.length-1)){
                    l.add(fighters[position[0]][position[1]]);
                } else {
                    position[0] = position[0] + 1;
                    l.add(fighters[position[0]][position[1]]);
                }
            }

            if(move.equals("right")){
                if(position[1] == (fighters[0].length)-1){
                    position[1] = 0;
                    l.add(fighters[position[0]][position[1]]);
                } else {
                    position[1]++;
                    l.add(fighters[position[0]][position[1]]);
                }
            }

            if(move.equals("left")){
                if(position[1] == 0){
                    position[1] =  (fighters[0].length)-1;
                    l.add(fighters[position[0]][position[1]]);
                } else {
                    position[1]--;
                    l.add(fighters[position[0]][position[1]]);
                }
            }
        }

        l.toArray(result);
        return result;
    }
}
