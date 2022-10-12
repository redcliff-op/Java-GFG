import java.io.File;

public class Code{
    public static void main(String[] args) {
        try{
            File f = new File("Test.txt");
            f.createNewFile();
            f.setReadOnly();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}