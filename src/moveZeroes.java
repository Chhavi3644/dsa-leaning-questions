import java.util.Arrays;
public class moveZeroes {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,6,7};
        moveatend(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveatend(int[] arr) {
        int ind=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[ind]=arr[i];
                ind++;
            }
        }
        for(int z=ind;z<arr.length;z++){
            arr[z]=0;
        }
    }

}
