package com.awanish;



import org.junit.Test;

public class SockBuyAndSell {
	
	@Test
	public void testMaxProfit(){
		
		int []stockPrices = {7,1,5,3,6,4};
		org.junit.Assert.assertEquals(5, calculateMaxProfit(stockPrices));
		
	}
	
	
	public int  calculateMaxProfit(int prices []){
		int maxProfit=0 ;
		int whenToBuy=prices[0];
		for (int i=0;i<prices.length;i++){
			maxProfit=Math.max(maxProfit, (prices[i]-whenToBuy));
			whenToBuy = Math.min(whenToBuy, prices[i]);
		}
		
		return maxProfit ;
	}
	
	
	public int  getMiniMumValueIndex(int prices []){
		int minValueOfStock=Integer.MAX_VALUE;
		int dayToBuy=0;
		for (int i=0 ;i<prices.length-1;i++){
		
			 if(prices[i]<minValueOfStock){
				 minValueOfStock=prices[i];
				dayToBuy=i;
			}
			
		}
		return dayToBuy ;
		
	}

}
