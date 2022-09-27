import java.util.ArrayList;

public class Code {
    public static void RDuplicates(int array[]){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            temp.add(array[i]);
        }
        for(int i=0;i<temp.size();i++){
            for(int j=i+1;j<temp.size();j++){
                if(temp.get(i)==temp.get(j)){
                    temp.remove(j);
                }
            }
        }
        for(int e: temp){
            System.out.print(e + " ");
        }
    }
    public static void main(String[] args) {
        int test[] = {1,2,3,2,3,2,4,5,5,6,4,6,7};
        RDuplicates(test);
    }    
}
