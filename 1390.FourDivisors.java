class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int res = 0;

        for(int i = 0; i < n; i++) {
            int cnt = 0;
            int sum = 0;

            for(int j = 1; j * j <= nums[i]; j++) {
                if(nums[i] % j == 0) {
                    int other = nums[i] / j;

                    cnt++;
                    sum += j;

                    if(other != j) {
                        cnt++;
                        sum += other;
                    }

                    if (cnt > 4) break;
                }
            }

            if(cnt == 4) {
                res += sum;
            }
        }

        return res;
    }
}