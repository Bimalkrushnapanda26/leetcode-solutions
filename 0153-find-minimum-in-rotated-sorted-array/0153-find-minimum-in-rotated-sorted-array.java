class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int ans=0;
        if(nums[start]<nums[end])
        {
            return nums[start];
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(nums[start]<nums[mid])
            {
                start=mid;
            }
            else
            {
                end=mid;
            }
        }
        return nums[start+1];
    }
}