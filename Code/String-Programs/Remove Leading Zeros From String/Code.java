public class Code{
    public static String leadzero(String s){
        int x = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '0'){
                x = i;
                break;
            }
        }
        return s.substring(x);
    }
    public static void main(String[] args) {
        System.out.println(leadzero("0000001234500"));
    }
}