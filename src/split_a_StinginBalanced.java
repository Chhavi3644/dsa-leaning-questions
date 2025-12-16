//leet_code_problem_no=1221
public class split_a_StinginBalanced {
    public static void main(String[] args) {
        String s="RLRRLLRLRL";
        int res=countBalance(s);
        System.out.println(res);

    }

    private static int countBalance(String s) {
         if(s==null || s.length()==0){
             return  0;
         }
         int left=0, right=0,count=0;
         for (int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(ch==
                     'L'){
                 left++;
             }else{
                 right++;
             }
             if(left==right){
                 count++;
             }
         }
         return  count;
    }
}
