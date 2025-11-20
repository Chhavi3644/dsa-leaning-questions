public class Search_insert {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6};
       int res= searchIns(arr,5);
       System.out.println(res);
    }

    private static int searchIns(int[] arr,int target) {
        int mid;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            mid = left + (right - left) / 2;

            if(arr[mid]==target){

                return mid;
            }
            else if(target>arr[mid]){
                left=mid+1;
            } else if (target<arr[mid]) {
               right=mid-1;
            }
        }
        return left;
    }
}
