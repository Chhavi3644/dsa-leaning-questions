import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
         Character[] ch={'a','b','c','d'};
         rev(ch);
        System.out.println(Arrays.toString(ch));
    }

    private static void rev(Character[] ch) {
        int st=0;
        int end=ch.length-1;
        while(st<end){
            Character m=ch[st];
            ch[st]=ch[end];
            ch[end]=m;
            st++;
            end--;
        }

    }
}
