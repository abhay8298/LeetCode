// TC= O(n) , SC=O(1)
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
            String s = n + "";
            if(s.length() % 2 == 0){
                count++;
            }
        }
        return count;
        
    }
}
