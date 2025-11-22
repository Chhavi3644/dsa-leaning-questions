public class buysellStock {
    public static void main(String[] args) {
        int[] stock={7,1,5,3,6,4};
        int[] res=maxProfit(stock);
        System.out.println("Max Profit: " + res[0] + ", Buy on day: " + res[1] + ", Sell on day: " + res[2]);

    }

    private static int[] maxProfit(int[] stock) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        int buy=0;
        int sell=0;
        int[] arr=new int[3];
        for(int i=0;i<stock.length;i++){
            if(stock[i]<min){
                min =stock[i];
                buy=i;
                arr[1]=buy;
            }
            int currProfit=stock[i]-min;
            if(currProfit>maxProfit){
                maxProfit=currProfit;
                sell=i;
                arr[2]=sell;
            }
        }
        arr[0]=maxProfit;
        return arr;
    }
}
