class Solution {
    public int subarraySum(int[] nums, int k) {
       Map <Integer, Integer> hm = new HashMap<>();
       hm.put(0, 1);

       int n = nums.length;
       int prefixSum = 0;
       int count = 0;

       for(int i = 0; i < n; i++){
        prefixSum += nums[i];

        int rem = prefixSum - k;

        count += hm.getOrDefault(rem, 0);

        hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);
       }
       
       return count;
    }
}