class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        double max = Integer.MIN_VALUE;

        int left = 0;
        for(int right = 0; right < n; right++) {
            sum += nums[right];

            if(right >= k) {
                sum -= nums[left];
                left++;
            }

            if(right >= k - 1){
                max = Math.max(max, sum);
            }
        }

        double avg = max / k;
        return avg;   
    }
}