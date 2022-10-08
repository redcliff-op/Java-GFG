import java.util.LinkedList;
import java.util.List;

public class Code {
    public static LinkedList<String> AddFirstLast(LinkedList<String> l, String x, String y){
        l.add(0, x);
        l.add(l.size(),y);
        return l;
    }   
    public static void main(String[] args) {
        LinkedList<String> temp = new LinkedList<String>(List.of("a", "b","c"));
        System.out.println(AddFirstLast(temp, "D", "P"));
    } 
}
