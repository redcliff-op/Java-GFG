import java.io.File;

public class Code {
    public static void main(String[] args) {
        File f = new File("Test.txt");
        File f2 = new File("Test2.txt");
        try{
            f.createNewFile();
            f.renameTo(f2);
        }catch(Exception e){
            System.out.println(e);
        }
    }    
}
