public class Code{
    public static void PrintEvenLength(String x){
        String s[] = x.split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].length()%2==0){
                System.out.println(s[i]);
            }
        }
    }
    public static void main(String[] args) {
        PrintEvenLength("Hello Redcliff Here");
    }
}