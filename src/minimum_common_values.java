import java.util.HashSet;
import java.util.Set;

public class minimum_common_values {
    public static void main(String[] args) {
        int[] nums1={1,2,3,4};
        int[] nums2={2,4};
        int res=find_common(nums1,nums2);
        System.out.print(res);
    }

    private static int find_common(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        int res=-1;
        for (int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                res=num;
                break;

            }
        }
        return res;
    }
}
