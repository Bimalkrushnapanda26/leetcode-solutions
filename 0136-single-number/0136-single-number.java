class Solution {
    public int singleNumber(int[] nums) {
        int output=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            output=output^nums[i];
        }
        return output;
    }
}