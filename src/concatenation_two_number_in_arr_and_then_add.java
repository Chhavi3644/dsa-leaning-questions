public class concatenation_two_number_in_arr_and_then_add {
    public static void main(String[] args) {
        int arr[]={7,52,2,4};
        long res=findArrayConcatenationval(arr);
        System.out.print(res);
    }

    private static long findArrayConcatenationval(int[] arr) {
        int l=0;
        int r=arr.length-1;
        long total=0;
        while (l<r){
            String cv=String.valueOf(arr[l])+String.valueOf(arr[r]);
            total+=Long.parseLong(cv);
            l++;
            r--;
        }
        return (arr.length%2==0)? total:total + Long.valueOf(arr[l]);
    }
}
