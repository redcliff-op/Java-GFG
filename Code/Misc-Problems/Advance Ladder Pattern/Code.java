import java.util.Scanner;

public class Code{
    public static void main(String[] args) {
        int n = 6;
        for(int i=0;i<n;i++){
            System.out.println();
            System.out.print("@");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<(n*i);j++){
                if(j==0){
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            if(!(i==(n-1))){
                System.out.println();
            }
            if(i==(n-1)){
                System.out.println("@");
                for(int k=1;k<n;k++){
                    for(int l=0;l<=(i*(n+1)+1);l++){
                        System.out.print(" ");
                    }
                    System.out.print("@");
                    System.out.println();
                }
            }
        }
    }
}