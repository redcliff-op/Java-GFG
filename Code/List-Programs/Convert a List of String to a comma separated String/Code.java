import java.util.ArrayList;
import java.util.List;

public class Code {
    public static String ComSep(List<String> s){
        String temp = String.join(",", s);
        return temp;
    }    
    public static void main(String[] args) {
        List<String> test = new ArrayList<String>(List.of("Fk", "You","VTU"));
        System.out.println(ComSep(test));
    }
}
