class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack <Integer> st = new Stack<>();
        int answer[] = new int[n];

        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && prices[st.peek()] > prices[i]){
                st.pop();
            }

            answer[i] = (st.isEmpty()) ? prices[i] : prices[i] - prices[st.peek()];

            st.push(i);
        }
        return answer;
    }
}