import java.util.ArrayList;
import java.util.Arrays;

public class Code {
    public static int[] rmduplicates(int arr[], int x){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] != x){
                temp.add(arr[i]);
            }
        }
        int [] f = new int [temp.size()];
        for(int i=0;i<temp.size();i++){
            f[i] = temp.get(i);
        }
        return f;
    }    
    public static void main(String[] args) {
        int [] test = {1,2,3,4,4,5,2,3,2,5,2,2,3,2,4};
        int [] array = rmduplicates(test, 2);
        System.out.println(Arrays.toString(array));
    }
}
