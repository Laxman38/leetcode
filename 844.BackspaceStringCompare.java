class Solution {
    public boolean backspaceCompare(String s, String t) {
       StringBuilder res1 = new StringBuilder(); 
       StringBuilder res2 = new StringBuilder(); 

       int i = 0, j = 0;
       int m = s.length(), n = t.length();

        while(i < m && j < n) {
            if(i < m) {
                if(s.charAt(i) == '#') {
                    if(res1.length() > 0) res1.deleteCharAt(res1.length() - 1);
                } else {
                    res1.append(s.charAt(i));
                }

                i++;
            }

            if(j < n) {
                if(t.charAt(j) == '#') {
                    if(res2.length() > 0) res2.deleteCharAt(res2.length() - 1);
                } else {
                    res2.append(t.charAt(j));
                }

                j++;
            }
        }

        while(i < m) {
            if(s.charAt(i) == '#') {
                if(res1.length() > 0) res1.deleteCharAt(res1.length() - 1);
            } else {
                res1.append(s.charAt(i));
            }

            i++;
        }

        while(j < n) {
            if(t.charAt(j) == '#') {
                if(res2.length() > 0) res2.deleteCharAt(res2.length() - 1);
            } else {
                res2.append(t.charAt(j));
            }

            j++;
        }

        return res1.toString().equals(res2.toString());
    }
}