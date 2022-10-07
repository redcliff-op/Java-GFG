import java.util.ArrayList;
import java.util.List;

public class Code{
    public static List spl(List<Integer> l){
        List<Integer> a = l.subList(0, (l.size()/2));
        List<Integer> b = l.subList((l.size()/2),l.size());
        List<List> templ = new ArrayList<>();
        templ.add(a);
        templ.add(b);
        return templ;
    }
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(4);
        test.add(-4);
        test.add(69);
        test.add(155);
        test.add(123);
        System.out.println(spl(test));
    }
}