// SC = O(1)   TC= O(n) 
class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(res,0,0,n,"");
        return res;
        
    }
    private void helper(List<String> res,int open,int close,int n,String s){
        if(s.length() == 2*n){
            res.add(s);
            return;
        }
        if(open < n){
            helper(res,open+1,close,n,s+"(");
        }
        if(close < open){
            helper(res,open,close+1,n,s+")");
        }
    }
}
