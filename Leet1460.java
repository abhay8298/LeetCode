// TC = O(n) 
// SC=O(1)
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] st =  new int[1001];
        for(int num : arr){
            st[num]++;
        }
        for(int num : target){
            st[num]--;
        }
        for(int i : st){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
