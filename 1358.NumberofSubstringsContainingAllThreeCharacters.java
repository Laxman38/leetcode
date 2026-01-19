class Solution {
    public int numberOfSubstrings(String s) {
        int freq[] = new int[3];
        int total = 0, n = s.length();

        int left = 0;
        for(int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            freq[ch - 'a']++;

            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                total += (n - right);
                char leftChar = s.charAt(left);

                freq[leftChar - 'a']--;
                left++;
            }
        }

        return total;
    }
}