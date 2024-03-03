
public class TwoSum { 
    public static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
         return new int[]{};
    }
    public static void main(String[] args){
        int[] nums = {3,3};
        int target = 6;
        int[] indices = twoSum(nums, target);
        if(indices.length == 2){
            System.out.println("indices with sum " +target+ ":[" +indices[0]+"," +indices[1]+"]");
        }
        else{
           System.out.println("no solution");
        }
    }
}