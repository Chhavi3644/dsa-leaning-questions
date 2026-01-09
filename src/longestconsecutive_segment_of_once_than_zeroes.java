public class longestconsecutive_segment_of_once_than_zeroes {
    public static void main(String[] args) {
        String s="1101";
        boolean res=logest(s);
        System.out.print(res);
    }

    private static boolean logest(String s) {
        int onecnt=0;
        int zerocnt=0;


        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch =='1'){
                onecnt++;
            }else {
                zerocnt++;
            }


        }
        if(onecnt > zerocnt){
            return true;
        }
        return  false;
    }
}
