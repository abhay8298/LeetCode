class Solution {
    public double averageWaitingTime(int[][] customers) {
        long ans = 0;
        int ct = 1;
        for(int[] cus: customers){
            ct = Math.max(ct, cus[0]);
            int f = cus[1]+ct;
            ct=f;
            int wt = f-cus[0];
            ans += wt;
        }
        return (double) ans / customers.length;
    }
}
