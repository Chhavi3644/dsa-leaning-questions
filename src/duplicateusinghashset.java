import java.util.HashSet;
import java.util.Set;

public class duplicateusinghashset {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4};
        boolean res=dupcheck(arr);
        System.out.println(res);
    }

    private static boolean dupcheck(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
