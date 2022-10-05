import java.util.Arrays;

public class Code{
    public static String charsort(String s){
        char arr[] = new char [s.length()];
        arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args) {
        System.out.println(charsort("program"));
    }
}