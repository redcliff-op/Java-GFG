public class Code {
    public static int[] getProductArrayExceptSelf(int[] arr) {
        int temp[] = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            int x=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    x=x*arr[j];
                }
            }
            temp[i]=x;
        }
        return temp;
    }
    public static void main(String[] args) {
        int test[] = {1,2,3,4,5};
        int x[] = getProductArrayExceptSelf(test);
        for(int e: x){
            System.out.print(e + " ");
        }

    }
}
