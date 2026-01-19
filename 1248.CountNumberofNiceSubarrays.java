class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {
        int left = 0, oddCnt = 0, cnt = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] % 2 == 1) oddCnt++;

            while(oddCnt > k) {
                if(nums[left] % 2 == 1) oddCnt--;
                left++;
            }

            cnt += right - left + 1;
        }

        return cnt;
    }
}