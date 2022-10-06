public class Code{
    public static boolean CompString(String r, String s){
        boolean same = true;
        if(r.length()!=s.length()){
            same = false;
        }
        else{
            for(int i=0;i>s.length();i++){
                if(r.charAt(i)!=s.charAt(i)){
                    same = false;
                }
            }
        }
        return same;
    }
    public static void main(String[] args) {
        System.out.println(CompString("Hello", "Hello"));
    }
}