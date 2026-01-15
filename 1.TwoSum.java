class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> hm = new HashMap<>();

        int ans[] = new int[2];
        ans[0] = ans[1] = -1;

        int n = nums.length;

        for(int i = 0; i < n; i++){
            int num = nums[i];
            int moreRequired = target - num;

            if(hm.containsKey(moreRequired)){
                ans[0] = hm.get(moreRequired);
                ans[1] = i;
            }

            hm.put(num, i);
        }
        return ans;
    }
}