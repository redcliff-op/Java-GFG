import java.util.ArrayList;
import java.util.Collections;


public class Code{

    // To sort the 2D Array - Coulumn Wise 

    public static void SortMatrix(int  arr[][]){
        for(int k=0;k<arr[0].length;k++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<arr.length;i++){
                temp.add(arr[i][k]);
            }
            Collections.sort(temp);
            for(int i=0;i<temp.size();i++){
                arr[i][k] = temp.get(i);
            }
        }
    }

    // To make Printing the resultant array Easier 
    
    public static void pr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }    
    public static void main(String[] args) {
        int [][] test = {{ 31, 27, 11, 42 },
                        { 10, 93, 91, 90 },
                        { 54, 78, 56, 89 },
                        { 24, 64, 20, 65 }};
        SortMatrix(test);
        pr(test);
    }
}