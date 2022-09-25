public class Code {
    public static void triangle(int x){
        for(int i=x,k=1;i>0;i--,k++){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int t=0;t<k;t++){
                System.out.print("*");
            }
            for(int t=1;t<k;t++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=1,k=x;i<=x;i++,k--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=k;j>0;j--){
                System.out.print("*");
            }
            for(int j=k;j>1;j--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(5);
    }
}