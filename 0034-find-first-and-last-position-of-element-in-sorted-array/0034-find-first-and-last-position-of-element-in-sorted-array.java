class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        if(nums.length==0)
        {
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        int lb = lowerBound(nums,target);
        int ub = upperBound(nums,target);
        if(nums[nums.length-1]<target || nums[lb]!=target)
        {
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        ans[0]=lb;
        ans[1]=ub-1;
        return ans;
    }
    public int lowerBound(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int ans=nums.length;
        while(start<=end)
        {
            mid=start+(end-start)/2;
             if(nums[mid]>=target)
             {
                end=mid-1;
                ans=mid;
             }
             else
             {
                start=mid+1;
             }
        }
        return ans;
    }
    public int upperBound(int nums[],int target)
    {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int ans=nums.length;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]>target)
            {
                end=mid-1;
                ans=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
}