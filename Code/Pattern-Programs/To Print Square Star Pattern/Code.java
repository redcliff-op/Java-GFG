public class Code {
    public static void starsquare(int x){
        for(int i=0;i<=x;i++){
            for(int j=0;j<=x;j++){
                if(i==0 || j==0 || i==x || j==x){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }  
    public static void main(String[] args) {
        starsquare(9);
    }  
}
