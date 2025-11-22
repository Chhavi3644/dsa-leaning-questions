import java.util.HashMap;
import java.util.Map;

public class singledigit {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5};
        int res=singleNumber(arr);
        System.out.println(res);
    }

    private static int singleNumber(int[] num) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(map.containsKey(num[i])){
                map.put(num[i],map.get(num[i])+1);
            }
            else {
                map.put(num[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value==1){
                return key;
            }
        }
        return 0;
    }
}
