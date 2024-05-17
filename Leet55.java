// Jump Game Medium
//TC=O(n) , SC=O(1)

class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        if(nums.length==1) return true;
        for(int i=0;i<nums.length-1 && max >= i;i++){
            if(max < i+nums[i]){
                max = i + nums[i];
            }
            if(max >= nums.length-1){
                return true;
            }
        } 
        return false;      
    }
}
