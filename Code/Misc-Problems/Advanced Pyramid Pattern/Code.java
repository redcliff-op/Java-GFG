public class Code {
    public static void triangle(int x){
        for(int i=x,k=1;i>0;i--,k=(k*2)){
            int u=0;
            if(x>4){
                for(u=4;u<=6;u++){
                    u = u + (x-4)*(x*(x-4));
                }
            }
            if(k==1){
                for(int j=(x*2+u);j>k;j--){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            for(int j=(x*2+u);j>k;j--){
                System.out.print(" ");
            }
            for(int t=1;t<k;t++){
                System.out.print("*");
            }
            for(int t=1;t<k;t++){
                System.out.print("*");
            }
        System.out.println();
        }
    } 
    public static void main(String[] args) {
        triangle(7);
    }
}