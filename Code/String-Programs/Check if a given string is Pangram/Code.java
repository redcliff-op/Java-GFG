public class Code{
    public static boolean pangram(String x){
        String t = "abcdefghijklmnopqrstuvwxyz";
        String s = x.toLowerCase();
        boolean pang = false;
        for(int i=0;i<t.length();i++){
            if(s.contains(String.valueOf(t.charAt(i)))){
                pang = true;
            }
            else{
                pang = false;
                break;
            } 
        }
        return pang;
    }
    public static void main(String[] args) {
        System.out.println(pangram("abcdefghijkDDEVlmnopqrFGTstuvwxyz"));
    }
}