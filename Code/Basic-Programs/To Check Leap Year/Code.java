public class Code {
    public static boolean isleap(int x){
        boolean isleap = true;
        if(x%4!=0){
            isleap = false;
        }
        else{
            if(x%100==0){
                if(x%400!=0){
                    isleap = false;
                }
            }
        }
        return isleap;
    }       
    public static void main(String[] args) {
        System.out.println(isleap(2020));
    } 
}
