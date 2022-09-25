public class Code{
    public static void LSearch(int arr[], int x){
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.printf("Element found at index %d", i);
                found = true;
                break;
            }
        }
        if(found==false){
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6,7,8,9,10};
        LSearch(x, 5);
    }
}