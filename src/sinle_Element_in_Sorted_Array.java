public class sinle_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,4,4};
        int res=-1;
  int i=0;
        while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
                i=i+2;

            }else{
                res=arr[i];
                System.out.print(res);
                break;
            }

        }

    }
}
