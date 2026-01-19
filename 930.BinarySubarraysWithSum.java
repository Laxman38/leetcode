class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return calculateSum(nums, goal) - calculateSum(nums, goal - 1);
    }

    public int calculateSum(int[] nums, int goals) {
        int sum = 0, left = 0, count = 0;

        if(goals < 0) return 0;

        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while(sum > goals) {
                sum -= nums[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
}