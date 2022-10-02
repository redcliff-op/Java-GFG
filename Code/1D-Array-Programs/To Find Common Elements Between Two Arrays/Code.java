import java.util.ArrayList;

public class Code {
    public static void common(String arr1[], String arr2[]){
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    temp.add(arr1[i]);
                }
            }
        }
        for(String e: temp){
            System.out.print(e + " ");
        }
    }
    public static void main(String[] args) {
        String [] test1 = {"Apple", "Orange", "Mangoes", "Banana"};
        String [] test2 = {"Mangoes", "Apple", "Grapes"};
        common(test1,test2);
    }
}
