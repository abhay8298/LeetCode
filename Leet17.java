class Solution {
    List<String> result=null;
    String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        if(digits.length() == 0) {
            return result;
        }
        dfs(0,digits,new StringBuilder());
        return result;   
    }
    void dfs(int l,String digits,StringBuilder temp){
        if(l==digits.length()){
            result.add(temp.toString());
            return;
        }
        char ch=digits.charAt(l);
        String str = map[ch-'0'];
        for(char c:str.toCharArray()){
            temp.append(c);
            dfs(l+1,digits,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
