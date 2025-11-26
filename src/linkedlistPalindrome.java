import java.util.LinkedList;

public class linkedlistPalindrome  {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(2);
        ls.add(1);
        System.out.println(isPalindrome(ls));
    }

    private static boolean isPalindrome(LinkedList<Integer> ls) {
    int left=0;
    int right=ls.size()-1;
    while(left<right){
        if(!ls.get(left).equals(ls.get(right))){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}
