class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int cnt = 0, max = 0;

        int left = 0;
        for(int right = 0; right < n; right++) {
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);

            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' ||  ch2 == 'u' ) {
                cnt++;
            }

            if(right >= k) {
                if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' ||  ch1 == 'u' ) {
                cnt--;
            }
                left++;
            }

            if(right >= k - 1) {
                max = Math.max(max, cnt);
            }
        }

        return max;   
    }
}