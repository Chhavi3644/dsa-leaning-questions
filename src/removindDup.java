public class removindDup {
    public static void main(String[] args) {
        int arr[]={1,1,3,5,8,8,9,0,0};
        int res=rmvdup(arr);
        for (int i=0;i<=  res;i++){
            System.out.print(arr[i]);
        }
    }

    private static int rmvdup(int[] arr) {
        int i=0;
        for(int j=1;j< arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];

            }
        }
        return i;
    }
}
