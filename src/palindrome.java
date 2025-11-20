import  java.util.*;
public class palindrome {
    public static void main(String[] args){
      int x=121;
      System.out.println(checkifpalin(x));

    }

    private static boolean checkifpalin(int x) {
        if(x<0){
            return false;
        }
        String num=x+"";
        int left=0;
        int right=num.length()-1;
        while (left<right){
            if(num.charAt(left)!=num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
