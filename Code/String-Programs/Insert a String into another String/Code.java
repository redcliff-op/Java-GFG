public class Code{
    public static String InsertString(String r, int x, String s){
        return r.substring(0,x) + s + r.substring(x);
    }
    public static void main(String[] args) {
        System.out.println(InsertString("IUseBtw", 4, "Arch"));
    }
}