public class phrasepalindrome {
    public static void main(String[] args) {
        String phrase="a man, a plan, a canal:Panama";
        boolean res=ispalindrome(phrase);
        System.out.println(res);

    }

    private static boolean ispalindrome(String phrase) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<phrase.length();i++){
            char ch=phrase.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String result=sb.toString();
        result=result.toLowerCase();
        if(checkPAlindome(result)){
            return true;
        }
        return false;

    }

    private static boolean checkPAlindome(String result) {
        int left=0;
        int right=result.length()-1;
        while (left<right){
            if(result.charAt(left)!=result.charAt(right)){
                return  false;
            }
            left++;
            right--;
        }
        return true;
    }
}
