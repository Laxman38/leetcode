import java.util.*;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int n = nums.length;
        int max1 = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                c++;
                max1 = Math.max(max1, c);
            }
            else{
                c = 0;
            }
        }
        
        return max1;
    }
}