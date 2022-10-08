import java.util.ArrayList;
import java.util.List;

public class Code {
    public static ArrayList<String> FindCommon(ArrayList<String> a, ArrayList<String> b){
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            if(b.contains(a.get(i))){
                temp.add(a.get(i));
            }
        }
        return temp;
    }    
    public static void main(String[] args) {
        ArrayList<String> test1 = new ArrayList<String>(List.of("You", "Got", "Rickrolled", "Lmao"));
        ArrayList<String> test2 = new ArrayList<String>(List.of("You","Cam't","Rickroll", "me", "Lmao"));
        System.out.println(FindCommon(test1, test2));
    }
}
