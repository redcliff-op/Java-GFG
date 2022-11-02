public class Code{
    public static String rever(String s){
        String temp = "";
        int x=0;
        int y=0;
        for(int i=y;i<s.length();i++){
            if(s.charAt(i)==' ' || i==s.length()-1){
                y = i;
                for(int j=i;j>=x;j--){
                    temp += s.charAt(j);
                }
                x = i;
                temp += ' ';
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(rever("Hello, This is Redcliff !"));
    }
}