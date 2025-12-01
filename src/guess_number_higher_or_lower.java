public class guess_number_higher_or_lower {
    public static void main(String[] args) {
        int n=10;
        int pick=8;
        int res=searchbyBinary(n,pick);
        System.out.println(res);
    }

    private static int searchbyBinary(int n, int pick) {
        int i=1;
        int j=n;
        int mid=-1;
        while(i<=j){
            mid=i+(j-i)/2;
            if(pick==mid){
                return mid;
            } else if (pick>mid) {
                i=mid+1;
            }else{
                j=mid-1;
            }


        }
        return mid;
    }
}
