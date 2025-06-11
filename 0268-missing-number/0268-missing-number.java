class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        long sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }
        long expsum = (long)n * (n-1)/2;
        return (int)(expsum - sum);
    }
}