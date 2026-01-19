class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer>st = new Stack<>();
       Map<Integer, Integer> hm = new HashMap<>();

       for(int num : nums2){
        while(!st.isEmpty() && num > st.peek()){
            hm.put(st.pop(), num);
        }

        st.push(num);
       }

        while(!st.isEmpty()){
            hm.put(st.pop(), -1);
        }

        int res[] = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            res[i] = hm.get(nums1[i]);
        }
        
        return res;
    }
}