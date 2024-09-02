// TC = O(n) SC = O(1)
class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0, cows = 0;
        int[] arr = new int[10];
        for(int i=0;i<secret.length();i++){
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s == g){
                bull++;
            }
            else{
                if(arr[s]++ < 0) cows++;
                if(arr[g]-- > 0) cows++;
            }

        }
        return bull+ "A" + cows + "B";
    }
}
