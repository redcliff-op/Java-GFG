public class Code{
    public static boolean eq(int arr1[][], int arr2[][]){
        boolean same = true;
        if(arr1.length==arr2.length && arr1[0].length==arr2[0].length){
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1[i].length;j++){
                    if(arr1[i][j]!=arr2[i][j]){
                        same = false;
                    }
                }
            }
        }
        else{
            same = false;
        }
        return same;
    }
    public static void main(String[] args) {
        int [][] test1 = {{1,2,3},{4,5,6}};
        int [][] test2 = {{1,2,3},{4,5,6}};
        System.out.println(eq(test1, test2));
    }
}