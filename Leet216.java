// TC = O(n) SC = O(n)
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(1,k,n,new LinkedList(),res);
        return res;
    }
    private void helper(int start, int k, int n, LinkedList ll, List<List<Integer>> res){
        if(k < 0 || n < 0){
            return;
        }
        if(k ==0 && n==0){
            res.add(new ArrayList(ll));
            return;
        }
        for(int i=start;i<=9;i++){
            ll.add(i);
            helper(i+1,k-1,n-i,ll,res);
            ll.removeLast();
        }
    }
}
