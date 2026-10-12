package DAY_5;

public class QQQ {
    public static int maxProfit(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
            int profit=prices[i]-buyPrice;  
            maxProfit=Math.max(maxProfit, profit);
            } else{
                buyPrice=prices[i];
            }
           
            
        }
        if(maxProfit>0){
            return maxProfit;
        }else{
            return 0;
        }
        
    }
    public static void main(String[] args) {
        int prices[]={5,4,3,2,1};
        int ans=maxProfit(prices);
        System.out.println(ans);
    }
}
