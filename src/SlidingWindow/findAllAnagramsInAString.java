package SlidingWindow;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        int len1 = s.length();
        int len2 = p.length();

        // Frequency arrays for characters a-z
        int[] freqP = new int[26];
        int[] freqS = new int[26];

        // Build freq array for p and first window of s
        for (int i = 0; i < len2; i++) {
            freqP[p.charAt(i) - 'a']++;
            freqS[s.charAt(i) - 'a']++;
        }

        // Slide the window over s
        for (int i = 0; i <= len1 - len2; i++) {
            if (Arrays.equals(freqP, freqS)) {
                ans.add(i);
            }
            // Slide window forward: remove left char and add next char
            if (i + len2 < len1) {
                freqS[s.charAt(i) - 'a']--;
                freqS[s.charAt(i + len2) - 'a']++;
            }
        }
        return ans;
    }
    
}