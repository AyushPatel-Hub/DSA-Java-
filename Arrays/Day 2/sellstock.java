public class sellstock {
    public static int sellStock(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0; //global profit
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice; // todays profit
                maxprofit=Math.max(profit,maxprofit);
            } else{
                buyprice=price[i];
            }
        }
        return maxprofit;
        
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        int sum=sellStock(price);
        System.out.println(sum);
    }
}
