import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class kth_distinct_String {
    public static void main(String[] args) {
        String [] arr={"d","c","b","d","a"};
        int k=3;
        String res=kthDis(arr,k);
        System.out.println(res);
    }

    private static String kthDis(String[] arr, int k) {
        Map<String,Integer> mp=new LinkedHashMap<String,Integer>();
        for (int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        List<String> ls=new ArrayList<String>();
        for (Map.Entry<String,Integer> ent:mp.entrySet()){
            if(ent.getValue()==1){
                ls.add(ent.getKey());
            }
        }
        if(ls.size()<k){
            return "";
        }
        String res=ls.get(k-1);
        return  res;
    }

}
