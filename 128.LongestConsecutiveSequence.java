class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> hs = new HashSet<>();
        int n = nums.length;
        int longest = 1;

        for(int i = 0; i < n; i++){
            hs.add(nums[i]);
        }

        for(int it : hs){
            if(!hs.contains(it - 1)){
                int count = 1;
                int x = it;

                while(hs.contains(x + 1)){
                    count++;
                    x++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}