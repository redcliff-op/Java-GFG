import java.util.ArrayList;
import java.util.List;
public class Okay{
    public static boolean Increasing(List<Integer> temp){
        boolean inc = true;
        for(int i=0;i<temp.size()-1;i++){
            if(temp.get(i)>=temp.get(i+1)){
                inc = false;
                break;
            }
        }
        return inc;
    }
    public static boolean canBeIncreasing(int[] nums){
        boolean canbe = true;
        List<Integer> temp = new ArrayList<>();
        for(int e: nums){
            temp.add(e);
        }
        for(int i=0;i<temp.size()-1;i++){
            if(temp.get(i)>=temp.get(i+1)){
                temp.remove(i);
                if(Increasing(temp)==true){
                    break;
                }else{
                    temp.add(i,nums[i]);
                    temp.remove(i+1);
                    if(Increasing(temp)==false){
                        canbe = false;
                    }
                }
            }
        }
        return canbe;
    }
    public static void main(String[] args) {
            int arr[] = {105,924,32,968};
        System.out.println(canBeIncreasing(arr));
    }
}