public class DIFFERECEBETWEENCHAR {
    public static void main(String[] args) {
        String s="aedb";
        String b="aeced";
        Character chd=difer(s,b);
        System.out.println(chd);
    }

    private static Character difer(String s, String b) {
        int s_sum=0;
        int t_sum=0;
        for(int i=0;i<s.length();i++){
            s_sum+=s.charAt(i);
        }
        for(int i=0;i<b.length();i++){
            t_sum +=b.charAt(i);
        }
        int res=t_sum-s_sum;
        return  (char) res;
    }

}
