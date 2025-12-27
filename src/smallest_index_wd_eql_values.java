public class smallest_index_wd_eql_values {
    public static void main(String[] args) {
        int[] num={0,1,2,3};

        int pos=-1;
        for(int i=0;i<num.length;i++){

            if(num[i]==i%10){

                pos=i;
                break;

            }
        }
        System.out.print(pos);
    }
}
