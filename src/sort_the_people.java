import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sort_the_people {
    public static void main(String[] args) {
        String[] names={"Mary", "John", "Emma"};
        int[] arr={180,165,170};
        String[] res=sortPeople(names,arr);
        System.out.print("[ ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.print("]");
    }

    private static String[] sortPeople(String[] names, int[] arr) {
        Map<Integer,String> mp=new HashMap<>();
        for(int i=0;i<names.length;i++){
            mp.put(arr[i],names[i]);

        }
        Arrays.sort(arr);
        String[] sortedNames=new String[names.length];
        int in=0;
        for (int i=arr.length-1;i>=0;i--){
            sortedNames[in]=mp.get(arr[i]);
            in++;
        }
        return  sortedNames;
    }
}
