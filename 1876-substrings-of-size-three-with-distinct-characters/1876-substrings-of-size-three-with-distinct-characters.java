class Solution {
    public int countGoodSubstrings(String s) {
        // A "good" substring must have length 3
        if (s.length() < 3) {
            return 0;
        }
        
        int res = 0;
        int i = 0;
        int j = 3; // j represents the boundary
        
        while (j <= s.length()) {
            // Check uniqueness of the three characters in the current window
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);
            
            if (a != b && a != c && b != c) {
                res++;
            }
            
            // Slide the window forward
            i++;
            j++;
        }
        
        return res;
    }
}