public class Code{

    // Method to Transpose the Matrix

    public static int[][] transpose(int arr[][]){
        int [][] f = new int [arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                f[i][j] = arr[j][i];
            }
        }
        return f;
    }

    // Just to make Printing the Resultant array Easier 

    public static void pr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] test1 ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        pr(transpose(test1));
    }
}