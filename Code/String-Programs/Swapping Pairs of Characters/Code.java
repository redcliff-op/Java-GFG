public class Code{
    public static String swap(String s){
        char arr[] = new char[s.length()];
        char temp;
        arr = s.toCharArray();
        for(int i=0;i<arr.length-1;i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        System.out.println(swap("Premium"));
    }
}