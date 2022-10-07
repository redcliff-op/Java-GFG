import java.util.ArrayList;
import java.util.List;

class MinMax{
    List<Integer> ls = new ArrayList<Integer>();
    MinMax(List<Integer> l){
        ls = l;
    }
    public int max(){
        int m = Integer.MIN_VALUE;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)>m){
                m = ls.get(i);
            }
        }
        return m;
    }
    public int min(){
        int m = Integer.MAX_VALUE;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)<m){
                m = ls.get(i);
            }
        }
        return m;
    }
}
public class Code{
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(4);
        test.add(-4);
        test.add(69);
        test.add(155);
        test.add(123);
        test.add(1000);
        MinMax m = new MinMax(test);
        System.out.println("Min Number from the list is : " + m.min());
        System.out.println("Max Number from the list is : " + m.max());
    }
}
