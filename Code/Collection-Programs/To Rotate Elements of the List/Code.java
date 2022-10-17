import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code{
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
        Collections.rotate(temp, 4);
        System.out.println(temp);
        Collections.rotate(temp, -8);
        System.out.println(temp);
    }
}