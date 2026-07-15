public class bestTimeToBuySellStock {
    public static void main(String[] args){
        int n = 6;
        int[] prices = {7,1,5,3,6,4};
        int minPrices = prices[0];
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(prices[i] < minPrices){
                minPrices = prices[i];
            }else{
                maxProfit = Math.max(maxProfit,prices[i]-minPrices);
            }
        }
        System.out.println(maxProfit);
    }
}
