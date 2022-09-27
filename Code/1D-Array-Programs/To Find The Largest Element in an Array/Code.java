public class Code {
    public static int max(int arr[]){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        return m;
    }   
    public static void main(String[] args) {
        int test[] = {12,-4,5,7,34,77,89,45,77,109,-104};
        System.out.println(max(test));
    } 
}
