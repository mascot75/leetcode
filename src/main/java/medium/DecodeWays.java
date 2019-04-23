package medium;

/**
 * @author mascot
 * @date 2019/4/22 12:42
 */
public class DecodeWays {
    public int numDecodings(String s) {

        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return s.charAt(0) == '0' ? 0 : 1;
        }

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;

        for (int i = 0; i < s.length(); i++) {
            dp[i + 1] = s.charAt(i) == '0' ? 0 : dp[i];
            if (i > 0 && (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2' && s.charAt(i) <= '6')){
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[s.length()];
    }
}
