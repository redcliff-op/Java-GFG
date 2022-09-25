public class Code {
    public static void prime(int x){
        for(int k=1;k<=x;k++){
            if(k==1||k==0){
                continue;
            }
            boolean prime = true;
            for(int i=2;i<k;i++){
                if(k%i==0){
                    prime = false;
                    break;
                }
            }
            if (prime==true){
                System.out.println(k);
            }
        }   
    }
    public static void main(String[] args) {
        prime(20);
    }
}