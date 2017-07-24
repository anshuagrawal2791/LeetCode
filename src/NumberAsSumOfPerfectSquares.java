/**
 * Created by anshu on 21/07/17.
 */
public class NumberAsSumOfPerfectSquares {
    public class Solution {
        int cache[];
        public int numSquares(int n) {
            // cache = new int[n+1];
            // Arrays.fill(cache,-1);
            // return check(n,0);
            // int r=check2(n,0,new ArrayList<>());
            if(n<4)
                return n;
            int r = getMinSquares(n);
            // System.out.println("---"+Arrays.toString(cache));
            return r;

        }
        int getMinSquares(int n)
        {
            // Create a dynamic programming table
            // to store sq
            int dp[] = new int[n+1];

            // getMinSquares table for base case entries
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 3;

            // getMinSquares rest of the table using recursive
            // formula
            for (int i = 4; i <= n; i++)
            {
                // max value is i as i can always be represented
                // as 1*1 + 1*1 + ...
                dp[i] = i;

                // Go through all smaller numbers to
                // to recursively find minimum
                for (int x = 1; x <= i; x++) {
                    int temp = x*x;
                    if (temp > i)
                        break;
                    else dp[i] = Math.min(dp[i], 1+dp[i-temp]);
                }
            }

            // Store result and free dp[]
            int res = dp[n];
            // System.out.println(Arrays.toString(dp));

            return res;
        }
    }
}
