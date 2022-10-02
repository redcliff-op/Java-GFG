import java.util.Arrays;

public class Code {
    public static int[] rotate(int arr[], int x){
        int [] temp = new int [arr.length];
        for(int i=x,y=0;i<arr.length;i++,y++){
            temp[y] = arr[i];
        }
        for(int i=0,y=arr.length-x;i<x;i++,y++){
            temp[y] = arr[i];
        }
        return temp;
    }    
    public static void main(String[] args) {
        int test[] = {1,2,3,4,5,6,7,8,9};
        int f[] = rotate(test, 3);
        System.out.print(Arrays.toString(f));
    }
}
