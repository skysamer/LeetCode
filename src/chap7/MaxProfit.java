package chap7;

public class MaxProfit {
	
	public static int maxProfit(int[] prices) {
		int maxprofit =0;
		int minprice=Integer.MAX_VALUE;
		
		for(int i=0; i<prices.length-1; i++) {
			if(prices[i]<minprice) {
				minprice=prices[i];
			}
			else if(prices[i]-minprice>maxprofit) {
				maxprofit=prices[i]-minprice;
			}
		}
		
        return maxprofit;
    }

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(prices));
	}

}
