class Solution {
    public int maxProfit(int[] prices) {
        int cur = Integer.MAX_VALUE;
        int answer = 0;
        for(int i = 0; i < prices.length; i++){
            answer = Math.max(answer, prices[i]-cur);
            cur = Math.min(cur, prices[i]);
        }

        return answer;
    }
}
