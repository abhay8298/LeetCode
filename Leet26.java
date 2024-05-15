// Remove Duplicates From Sorted Array Leetcode 26 
// TC=O(n) , SC=O(1)


class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i < nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }
            else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
