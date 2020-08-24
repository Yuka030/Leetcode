public class PartitionEqualSubsetSum_416 {
    public boolean canPartition(int[] nums) {
        int length = nums.length;
        if(length == 0) return false;

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        if(sum % 2 != 0) return false;

        int halfSum = sum / 2;

        boolean[][] dp = new boolean[length][halfSum + 1];

        for(int i = 0; i < length; i++){
            dp[i][0] = true;
        }

        for(int j = 0; j < halfSum + 1; j++){
            dp[0][j] = nums[0] == j;
        }

        for(int i = 1; i < length; i++){
            for(int j = 1; j < halfSum + 1;j++){
                dp[i][j] = dp[i - 1][j];

                if(j >= nums[i]){
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }

        return dp[length - 1][halfSum];
    }
}
