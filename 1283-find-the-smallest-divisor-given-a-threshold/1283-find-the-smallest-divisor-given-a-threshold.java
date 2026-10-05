class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=maxElement(nums);
        int mid=0;
        int ans=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(findDivisor(nums,mid)<=threshold)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
    
                start=mid+1;
                }
        }
        return ans;
    }
    public int findDivisor(int[] nums,int divisor)
    {
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            result+=Math.ceil((float) nums[i]/divisor);
        }
        return result;
    }
    public int maxElement(int[] nums)
    {
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
            else
            {
                continue;
            }
        }
        return max;
    }
}