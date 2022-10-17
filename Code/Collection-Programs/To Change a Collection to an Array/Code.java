import java.util.List;
import java.util.ArrayList;

public class Code{
    public static void main(String[] args) {
        List<String> temp = new ArrayList<String>(List.of("Hello", "There", "This", "is","Redcliff"));
        String arr[] = new String[temp.size()];
        temp.toArray(arr);
        for(String s: arr){
            System.out.print(s + " ");
        }
    }
}