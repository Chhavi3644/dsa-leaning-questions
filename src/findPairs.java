import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findPairs {
    public static void main(String[] args) {
        int arr[]={3,1,4,1,5};
        int k=2;
        int res=fp(arr,k);
        System.out.print(res);
    }

    private static int fp(int[] arr, int k) {
        int count=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        Set<Integer> st=mp.keySet() ;
        for (int num:st){
            if(k>0 && mp.containsKey(num+k)){
                count++;
            }
            if(k==0 & mp.get(num)>1){
                count++;
            }
        }

        return count;
    }
}
