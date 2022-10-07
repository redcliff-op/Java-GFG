import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>(List.of(23,44,53,244,33,532,44,2,3,45,89));
        Collections.sort(test);
        System.out.println(test);
    } 
}
