import java.util.ArrayList;
import java.util.List;

public class Code {
    public static ArrayList rmdup(ArrayList<Integer> ar){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<ar.size();i++){
            if(!temp.contains(ar.get(i))){
                temp.add(ar.get(i));
            }
        }
        return temp;
    }    
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>(List.of(1,2,3,4,5,3,2,4,1,5,3,3,3,4,2));
        System.out.println(rmdup(test));
    }
}
