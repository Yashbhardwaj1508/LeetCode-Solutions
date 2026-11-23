class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        int i = 0;
        int maxFreq = 0;
        int ans = 0;

        int[] Freq = new int [26];

        for(int j = 0; j < n; j++ ){
            char ch = s.charAt(j);
            Freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq , Freq[ch - 'A']);

            while((j - i + 1) - maxFreq > k){
              Freq[s.charAt(i) - 'A']--;
                i++;

            }
            ans = Math.max(ans, j - i + 1);

        }
        return ans;
    }
}
