class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        StringBuilder res = new StringBuilder();

        int n = s.length();

        for(int i = 0; i < n; i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freq.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        for(Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int count = entry.getValue();

            for(int i = 0; i < count; i++) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}