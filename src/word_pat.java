import java.util.HashMap;
import java.util.Map;

public class word_pat {
    public static void main(String[] args) {
        String pat="abba";
        String s="dog cat cat dog";
        boolean res=wordPattern(pat,s);
        System.out.print(res);
    }

    private static boolean wordPattern(String pat, String s) {
        Map<Character,String> charmp=new HashMap<>();
        Map<String,Character> wmp=new HashMap<>();
        String words[]=s.split(" ");
        if(pat.length()!=words.length){
            return  false;
        }
        for (int i=0;i<words.length;i++){
            char ch=pat.charAt(i);
            String word=words[i];
            if(!charmp.containsKey(ch)){
                if(wmp.containsKey(word)){
                    return  false;
                }
                else{
                    charmp.put(ch,word);
                    wmp.put(word,ch);
                }
            }
            else{
                String mappedword=charmp.get(ch);
                if(!mappedword.equals(word)){
                    return  false;
                }
            }
        }
        return  true;

    }
}
