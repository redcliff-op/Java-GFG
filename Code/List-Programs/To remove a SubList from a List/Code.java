import java.util.ArrayList;
import java.util.List;

public class Code{
    public static List rmsublist(List l, int x, int y) {
        l.subList(x,y).clear();
        return l;
    }
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(4);
        test.add(-4);
        test.add(69);
        test.add(155);
        test.add(123);
        test.add(6);
        test.add(12);
        System.out.println(rmsublist(test, 1, 3));
    }
}