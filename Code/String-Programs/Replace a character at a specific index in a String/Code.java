public class Code{
    public static String replacestring(String o, int i, String m){
        return(o.substring(0,i) + m + o.substring(i+1));
    }
    public static void main(String[] args) {
        System.out.println(replacestring("Hello", 2, "a"));
    }
}