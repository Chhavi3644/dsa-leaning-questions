import java.util.HashMap;
import java.util.Map;

public class first_unique_character {
    public static void main(String[] args) {
        String str="aabb";
        int res=firtUniqChar(str);
        System.out.println(res);
    }

    private static int firtUniqChar(String str) {
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i< str.length();i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
            }else{
                mp.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(mp.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}
