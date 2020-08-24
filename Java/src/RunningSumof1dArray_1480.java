public class RunningSumof1dArray_1480 {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int currNum = 0;

        for (int i=0; i < nums.length; i++) {
            sum[i] += nums[i] + currNum;
            currNum = sum[i];
        }

        return sum;
    }
}
