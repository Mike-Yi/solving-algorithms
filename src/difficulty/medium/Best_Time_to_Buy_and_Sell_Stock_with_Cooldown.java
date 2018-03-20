package difficulty.medium;

public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Best_Time_to_Buy_and_Sell_Stock_with_Cooldown s = new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown();
		int[] a = new int[] {1,4,2};
		s.maxProfit(a);
	}
    public int maxProfit(int[] prices) {
    	if(prices.length == 0) return 0;
    	int[] buy = new int[prices.length];
    	int[] sell = new int[prices.length];
    	int[] rest = new int[prices.length];
    	
    	buy[0] = -prices[0];
    	
    	for(int i = 1; i < prices.length; i++) {
    		buy[i] = Math.max(rest[i-1] - prices[i], buy[i-1]);
    		sell[i] = Math.max(sell[i-1], prices[i] + buy[i-1]);
    		rest[i] = Math.max(Math.max(rest[i-1], buy[i-1]), sell[i-1]);
    	}
    	
    	return sell[prices.length-1];
    }

}
