public class Code{
    public static void main(String[] args) {
        int x = 6;
        for(int i=0;i<=x;i++){
            if(i<x-1){
                System.out.println("@");
            }else if(i==x){
                System.out.print("@");
                for(int j=0;j<x;j++){
                    System.out.print("*");
                }
                System.out.println();
                for(int s=0,t=x;s<x-1;s++,t=t+x){
                    for(int y=0;y<=t;y++){
                        System.out.print(" ");
                    }
                    for(int q=0;q<x;q++){
                        System.out.print("*");
                    }
                    if(s==(x-2)){
                        for(int r=0;r<x;r++){
                            if(r==0){
                                System.out.print("@");
                            }else{
                                for(int p=0;p<=(x*x);p++){
                                    System.out.print(" ");
                                }
                                System.out.print("@");   
                            }
                            System.out.println();
                        }   
                    }
                    System.out.println();
                }
            }
        }
    }
}