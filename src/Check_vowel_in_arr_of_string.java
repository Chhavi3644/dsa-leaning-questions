public class Check_vowel_in_arr_of_string {
    public static void main(String[] args) {
        String arr[]={"are","amy","u"};
        int res=vowelString(arr);
        System.out.print(res);
    }

    private static int vowelString(String[] arr) {
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(checkVow(arr[i])){
                count++;
            }
        }
        return  count;
    }

    private static boolean checkVow(String s) {
        if (s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' ||s.charAt(0)=='u'){
            if(s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='e' ||s.charAt(s.length()-1)=='i' || s.charAt(s.length()-1)=='o' || s.charAt(s.length()-1)=='u'){
                return  true;
            }
        }
        return  false;
    }
}
