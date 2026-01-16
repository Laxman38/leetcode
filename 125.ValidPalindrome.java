class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return isPalindromeCheck(0, s.length()-1, s);
    }

    public boolean isPalindromeCheck(int left, int right, String s){
        if(left >= right) return true;
        if(s.charAt(left) != s.charAt(right)) return false;
        return isPalindromeCheck(left + 1, right - 1, s);
    }
}