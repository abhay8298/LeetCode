// TC=O(n) 
// SC=O(1) as the size of the array is only 2 and it is not growing with input size .

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int r = target-nums[i];
            if(map.containsKey(r)){
                int[] ans = {map.get(r),i};
                return ans;
            }
            map.put(nums[i],i);
        }
        return null;
        
    }
}
