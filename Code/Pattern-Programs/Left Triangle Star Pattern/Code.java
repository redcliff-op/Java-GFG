public class Code {
    public static void triangle(int x){
        for(int i=x,k=1;i>0;i--,k++){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int t=0;t<k;t++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(5);
    }
}
