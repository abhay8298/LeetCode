// Time Complexity: O(n^2 * log(n))
// Space Complexity: O(n^2)

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] req = new int[n * (n + 1) / 2];
        int i=0;
        int a = 0;
        while(i < nums.length){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                req[a++] = sum;
            }
            i++;
        }
        Arrays.sort(req);
        long ans = 0;
        for(int k = left-1;k<right;k++){
            ans += req[k];
        }
        return (int)(ans % 1_000_000_007);// Use modulo to return the answer within the expected range
        
    }
}
