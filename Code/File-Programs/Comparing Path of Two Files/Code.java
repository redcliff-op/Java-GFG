import java.io.File;

public class Code{
    public static void main(String[] args) {
        File f1 = new File("Test1.txt");
        File f2 = new File("Test2.txt");
        File f3 = new File("Test1.txt");

        try{
            f1.createNewFile();
            f2.createNewFile();
        }catch(Exception e){
            System.out.println(e);
        }

        if(f1.compareTo(f2)==0){
            System.out.println("They have the same path");
        }else{
            System.out.println("They don't have the same path");
        }
        
        if(f1.compareTo(f3)==0){
            System.out.println("They have the same path");
        }else{
            System.out.println("They don't have the same path");
        }
    }
}