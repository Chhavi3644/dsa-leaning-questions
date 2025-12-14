import java.util.Stack;

public class remove_all_adjacent_duplicates_in_string {
    public static void main(String[] args) {
        String s="abbaca";
        String res=removeDup(s);
        System.out.println(res);

    }

    private static String removeDup(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            } else if (st.peek()==ch) {
                st.pop();

            }else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

}
