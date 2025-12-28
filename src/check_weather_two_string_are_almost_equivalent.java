public class check_weather_two_string_are_almost_equivalent {
    public static void main(String[] args) {
        String str1="aaaa";
        String str2="bccb";
        boolean res= checkEqual(str1,str2);
        System.out.print(res);
    }

    private static boolean checkEqual(String str1, String str2) {
        int freq1[]= new int[26];
        int freq2[]= new int[26];
        for(int i=0;i<str1.length();i++){
            freq1[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            freq1[str2.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(Math.abs(freq1[i]-freq2[i])>3){
                count++;
                break;
            }
        }
        if(count==1){
            return  false;
        }
        return  true;
    }
}
