import java.util.ArrayList;
import java.util.List;

public class Code{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> temp = new ArrayList<>();
        for(int x: arr){
            temp.add(x);
        }
        System.out.println(temp);
    }
}