import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class check_if_all_char_hhave_equal_number_of_occurence {

    public static void main(String[] args) {
        String s="aaabbb";
        boolean res= checkif(s);
        System.out.print(res);
    }

    private static boolean checkif(String s) {
        Map<Character,Integer> mp =new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) + 1);
            } else {
                mp.put(ch, 1);
            }
        }
        Set<Integer> st=new HashSet<Integer>(mp.values());
            if(st.size()==1){
                return true;
            }
            return false;

    }

    }
