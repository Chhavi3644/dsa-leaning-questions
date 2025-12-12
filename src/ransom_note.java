import java.util.HashMap;
import java.util.Map;

public class ransom_note {
    public static void main(String[] args) {
        String st1="aa";
        String st2="aa";
        Map<Character,Integer> mp=new HashMap<>();

         for(int i=0;i<st2.length();i++) {
             if (mp.containsKey(st2.charAt(i))) {
                 mp.put(st2.charAt(i), mp.get(st2.charAt(i)) + 1);
             } else {
                 mp.put(st2.charAt(i), 1);

             }
         }
             int count=0;
             for(int i=0;i<st1.length();i++){
                 char ch=st1.charAt(i);
                 if(mp.containsKey(ch) && mp.get(ch)>0){
                     count++;
                     mp.put(ch,mp.get(ch)-1);

                 }
                 else{
                     break;

                 }
             }
             if(count==st1.length()){
                 System.out.println(true);
             }
             else{
                 System.out.println(false);
             }

    }
}
