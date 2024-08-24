TC = O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a = 0, b = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(b < s.length()){
            if(!set.contains(s.charAt(b))){
                set.add(s.charAt(b));
                b++;
                max = Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(a));
                a++;
            }
        }
        return max;
    }
}
