class Solution {
    public int majorityElement(int[] nums) {
        int major=nums[0];
        int n=nums.length;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==major)
            {
                count++;
            }
            else
            {
                count--;
                if(count==-1)
                {
                    count=0;
                    major=nums[i];
                }
            }
        }
        return major;
    }
}