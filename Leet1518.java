class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            int rf = numBottles/numExchange;
            ans+=rf;
            int e = numBottles%numExchange;
            numBottles = rf+e;
        }
        return ans;
    }
}
