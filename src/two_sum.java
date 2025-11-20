
public class two_sum {
    public static void main(String[] args){
        double[] arr={1.2,1.7,3.0,4.0,5.0};
        int target=3;
        int[] res= twoSum(arr,target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");


    }

    private static int[] twoSum(double[] nums, int target) {
        for(int i=0;i<nums.length; i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.round(nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
