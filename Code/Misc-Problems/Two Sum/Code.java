public class Code {
    public static int[] twoSum(int[] nums, int target) {
        int temp[] = new int [2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]+nums[j]==target){
                        temp[1]=i;
                        temp[0]=j;
                        break;
                    }
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int test[] = {2,7,11,15};
        int tt[] = twoSum(test,9);
        for(int w: tt){
            System.out.print(w + " ");
        }
    }
}
