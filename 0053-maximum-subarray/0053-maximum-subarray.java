class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>curr_sum+nums[i])
            {
                curr_sum=nums[i];
            }
            else
            {
                curr_sum+=nums[i];
            }
            max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
}