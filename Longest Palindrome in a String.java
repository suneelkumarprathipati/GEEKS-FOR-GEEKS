
class Solution{
    static String longestPalin(String S){
         if (S == null || S.length() < 2) {
            return S;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < S.length(); i++) {
            // Check for odd-length palindromes
            int len1 = expandAroundCenter(S, i, i);
            // Check for even-length palindromes
            int len2 = expandAroundCenter(S, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }

        return S.substring(start, start + maxLength);
    }
    private static int expandAroundCenter(String S, int left, int right) {
        while (left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
