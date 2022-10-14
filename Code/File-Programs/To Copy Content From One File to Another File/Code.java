import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Code{
    public static void main(String[] args) {
        File f1 = new File("Test1.txt");
        File f2 = new File("Test2.txt");
        try{
            f2.createNewFile();
            FileWriter fr = new FileWriter(f2);
            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine()){
                fr.write(sc.nextLine() + "\n");
            }
            fr.close();
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}