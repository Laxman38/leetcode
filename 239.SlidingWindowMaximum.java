class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        Deque<Integer> dq = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);

            if(i >= k - 1) {
                res.add(nums[dq.peekFirst()]);
            }
        }

        int res1[] = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            res1[i] = res.get(i);
        }

        return res1;
    }
}