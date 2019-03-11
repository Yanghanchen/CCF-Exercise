import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        if(s>n){
            System.out.println(0);
        }else {
            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = sc.nextInt();
            }
            int[][] dp = new int[n + 1][s + 1];
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= s; j++) {
                    dp[i][j] += (2 * dp[i - 1][j]);
                    dp[i][j] %= (1e9 + 7);
                    if (j > 0)
                        dp[i][j] += dp[i - 1][j - 1];
                    dp[i][j] %= (1e9 + 7);
                }
            }
            System.out.println(dp[n][s]);
        }
    }
}