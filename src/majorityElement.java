import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr={3,3,3,2,4};
        int res=major(arr);
        System.out.println(res);
    }

    private static int major(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        int maj=(arr.length/2);
        int output=0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>maj){
                output=entry.getKey();
            }
        }
        return  output;
    }
}
