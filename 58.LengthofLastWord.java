class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int n = s.length();
        int length = 0;

        for(int i = n - 1; i >= 0; i--) {
            if(Character.isLetter(s.charAt(i))) {
                length++;
            } else {
                break;
            }   
        }

        return length;
    }
}