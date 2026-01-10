public class findpivot {
    public static void main(String[] args) {
        int [] arr={1,7,3,6,5,6};
         int res=pivot(arr);
         System.out.print(res);

    }

    private static int pivot(int[] arr) {
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int leftSum=0;
        for (int i=0;i<arr.length;i++){
            if(leftSum==(sum-arr[i]-leftSum)){
                return  arr[i];
            }
            leftSum+=arr[i];
        }
        return  -1;
    }
}
