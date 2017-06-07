/**
 * Created by anshu on 06/06/17.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max_len =1;
        int begin=0;
        boolean dp[][] = new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;

        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                begin =i;
                max_len=2;
            }
        }
        for(int len=3;len<=n;len++){
            for(int from=0;from<=n-len;from++){
                int to = from + len-1;
                if(s.charAt(from)==s.charAt(to)&&dp[from+1][to-1]){
                    dp[from][to]=true;
                    begin=from;
                    max_len=len;
                }
            }
        }
        return s.substring(begin,begin+max_len);


    }
}
