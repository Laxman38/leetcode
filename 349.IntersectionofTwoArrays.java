class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            st1.add(nums1[i]);
        }

        for(int i = 0; i < n; i++) {
            st2.add(nums2[i]);
        }

        for(int num: st1) {
            if(st2.contains(num)) {
                res.add(num);
            }
        }

        int res1[] = new int[res.size()];

        for(int i = 0; i < res.size(); i++) {
            res1[i] = res.get(i);
        }

        return res1;
    }
}