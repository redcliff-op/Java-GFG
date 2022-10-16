import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Code{
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
        Collections.reverse(temp);
        for(Integer e: temp){
            System.out.print(e + " ");
        }
    }
}