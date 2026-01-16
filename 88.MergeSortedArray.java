    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            List<Integer> res = new ArrayList<>();

            int i = 0, j = 0;
            while(i < m && j < n) {
                if(i < m && j < n) {
                    if(nums1[i] <= nums2[j]) {
                        res.add(nums1[i++]);
                    } else {
                        res.add(nums2[j++]);
                    }
                }
            }

            while (i < m) res.add(nums1[i++]);
            while (j < n) res.add(nums2[j++]);

            for(i = 0; i < m + n; i++) {
                nums1[i] = res.get(i);
            }
        }
    }