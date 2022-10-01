import java.util.ArrayList;

public class Code {

    // Method to interchange 

    public static int[][] interchange(int arr[][]){
        int [][] tempf = new int [arr.length][arr[0].length];
        for(int x=tempf.length-1,y=0;x>=0;x--,y++){
            if(x==0 || y == 0 || x == tempf[0].length-1 || y == tempf[0].length-1){
                for(int i=0;i<arr.length;i++){
                    tempf[i][x] = arr[i][y];
                }
            }
            else{
                for(int i=0;i<arr.length;i++){
                    for(int j=1;j<arr[i].length-1;j++){
                        tempf[i][j] = arr[i][j];
                    }
                }
            }
        }
        return tempf;
    }

    // To make printing the resultant matrix easier
    
    public static void pr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
    int [][] test1 ={{1,2,3,4},
                     {1,2,3,4},
                     {1,2,3,4},
                     {1,2,3,4}};
    pr(interchange(test1));  
    }
}
