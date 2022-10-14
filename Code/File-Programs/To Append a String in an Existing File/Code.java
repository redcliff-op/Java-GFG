import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Code{
    public static void AppendString(String filename, int index, String appended){
        File f = new File(filename);
        ArrayList<String> temp = new ArrayList<>();
        try{
            Scanner sc1 = new Scanner(f);
            while(sc1.hasNextLine()){
                temp.add(sc1.nextLine());
            }
            temp.remove(index);
            temp.add(index,appended);
            FileWriter fr = new FileWriter(f);
            for(int i=0;i<temp.size();i++){
                fr.write(temp.get(i) + "\n");
            }
            fr.close();
            sc1.close();
        }catch(Exception e){
            System.out.println(e);
        }    
    }
    public static void main(String[] args) {
        AppendString("Test.txt", 0,"Hey There");
    }
}