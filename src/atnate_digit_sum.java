public class atnate_digit_sum {
    public static void main(String[] args) {
        int n=521;
        int sm=altenateSUm(n);
        System.out.print(sm);
    }

    private static int altenateSUm(int n) {
        int count=-1;
        int sum=0;

        while(n>0){
           int z=n%10;
            count++;
            if(count%2==0){
                sum+=z;
            }else{
                sum-=z;
            }

            n=n/10;

        }
    return  sum;
    }
}
