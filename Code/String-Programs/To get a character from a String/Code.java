public class Code {
    public static char getcharacter(String s, int i){
        return s.charAt(i);
    }    
    public static void main(String[] args) {
        String test = "Life Sucks Man";
        System.out.println(getcharacter(test, 3));
    }
}
