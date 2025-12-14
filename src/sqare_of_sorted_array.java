public class sqare_of_sorted_array {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] res=sortedSquare(nums);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

    private static int[] sortedSquare(int[] nums) {
        int res[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int z=res.length-1;z>=0;z--){
            int ls=nums[i]*nums[i];
            int rs=nums[j]*nums[j];
            if(ls>rs){
                res[z]=ls;
                i++;
            }else{
                res[z]=rs;
                 j--;
            }
        }
        return  res;
    }
}
