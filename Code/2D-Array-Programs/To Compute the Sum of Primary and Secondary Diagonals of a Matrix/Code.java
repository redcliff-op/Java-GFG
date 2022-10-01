class ComputeMatrix{
    int arr[][];
    int t;
    ComputeMatrix(int ar[][]){
        arr = ar;
    }
    public int pdiagonal(){
        t=0;
        for(int i=0,j=0;i<arr.length;i++,j++){
            t += arr[i][j];
        }
        return t;
    }
    public int sdiagonal(){
        t=0;
        for(int i=0,j=arr[i].length-1;i<arr.length;i++,j--){
            t += arr[i][j];
        }
        return t;
    }
}
public class Code{
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,1},
                       {1,2,1,1},
                       {1,1,3,1},
                       {3,1,1,4}};
        ComputeMatrix cm = new ComputeMatrix(mat);
        System.out.println("Sum of Primary Diagonal is : " + cm.pdiagonal());
        System.out.println("Sum of Secondary Diagonal is : " + cm.sdiagonal());
    }
}
