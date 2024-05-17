// Best Time to buy and sell stocks Easy
//TC=O(n) , SC=O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < buyPrice){
                buyPrice=prices[i];
            }
            else{
                int currentProfit=prices[i]-buyPrice;
                if(currentProfit > max){
                    max=currentProfit;
                }

            }
        }
        return max;
        
    }
}
