public class Code {

    // To interechange the Rows

    public static int[][] interchange(int arr[][]){
        int [][] temp = new int [arr.length][arr[0].length];
        for(int j=0;j<arr[0].length;j++){
            temp[0][j] = arr[arr.length-1][j];
        }
        for(int j=0;j<arr[0].length;j++){
            temp[temp.length-1][j] = arr[0][j];
        }
        for(int i=1;i<arr.length-1;i++){
            for(int j=0;j<arr[i].length;j++){
                temp[i][j] = arr[i][j];
            }
        }
        return temp;
    }

    // To make Printing the resultant matrix easier 
    
    public static void pr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,1},
                      {2,2,2,2},
                      {3,3,3,3},
                      {4,4,4,4}};
        pr(interchange(mat));
        
    }
}
