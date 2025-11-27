import java.lang.reflect.Array;
import java.util.Arrays;

public class Counting_Bits {
    public static void main(String[] args) {
        int n=5;
        int[] res=countbit(n);
        System.out.println(Arrays.toString(res));
    }

    private static int[] countbit(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            String bin=Integer.toBinaryString(i);
            int one_count=countOnes(bin);
            ans[i]=one_count;
        }
        return ans;
    }

    private static int countOnes(String bin) {
        int count=0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
