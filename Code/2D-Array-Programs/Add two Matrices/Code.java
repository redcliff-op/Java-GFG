public class Code {

    // Function to add the two Matrices 
    
    public static int[][] AddMatrix(int arr1[][], int arr2[][]){
        int [][] t = new int [arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                t[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return t;
    }

    // Just to make Printing the final array easier 

    public static void pr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] test1 = {{1,2,3}, {4,5,6}};
        int [][] test2 = {{7,8,9}, {10,11,12}};
        int [][] result = AddMatrix(test1, test2);
        pr(result);
    }    
}
