import java.io.File;
import java.io.FileWriter;

public class Code{
    public static void main(String[] args) {
        File f = new File("Test.txt");
        try{
            f.createNewFile();
            FileWriter fr = new FileWriter("Test.txt");
            fr.write("Hello There");
            fr.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}