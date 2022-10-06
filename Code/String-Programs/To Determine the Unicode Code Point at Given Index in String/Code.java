public class Code{
    public static int unicode(String s, int x){
        return s.codePointAt(x);
    }
    public static void main(String[] args) {
        String test = "Hello There";
        System.out.println(unicode(test, 0));
        System.out.println(unicode(test, 1));
        System.out.println(unicode(test, 2));
        System.out.println(unicode(test, 3));
        System.out.println(unicode(test, 4));
    }
}