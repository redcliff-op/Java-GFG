public class Code {
    public static boolean eq(int arr1[],int arr2[]){
        boolean same = true;
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    same = false;
                }
            }
        }
        else{
            same = false;
        }
        return same;
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int [] b = {1,2,3,4,5,6};
        System.out.println(eq(a,b));
    }
}
