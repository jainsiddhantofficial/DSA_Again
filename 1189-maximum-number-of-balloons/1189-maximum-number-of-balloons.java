class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] f = new int[26];
        for (char ch : text.toCharArray()) f[ch - 'a']++;

        if (f['l' - 'a'] <= 1 || f['o' - 'a'] <= 1) return 0;
        if (f['b' - 'a'] < 1 || f['a' - 'a'] < 1 || f['b' - 'a'] < 1) return 0;

        int minFreqOfLO = Math.min(f['l' - 'a'] , f['o' - 'a']);
        int minFreqOfBAN = Math.min(f['b' - 'a'] , Math.min(f['a' - 'a'] , f['n' - 'a']));

        return Math.min(minFreqOfLO / 2 , minFreqOfBAN);
    }
}