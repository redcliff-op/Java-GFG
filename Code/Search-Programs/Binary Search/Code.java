public class Code{
    public static int BSearch(int arr[], int x){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (high+low)/2;
            if(x==arr[mid]){
                return mid;
            }
            else if (x<arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] test = {-24,-10,-1,1,3,4,5,69,77,89,101};
        System.out.print(BSearch(test, 69));
    }
}
