class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr_count=0;
        int max_count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {   
            if(nums[i]==0)
            {
                continue;
            }
            else
            {
                while(i<n && nums[i]==1)
                {
                    curr_count+=1;
                    i++;
                }
                if(curr_count>max_count)
                {
                    max_count=curr_count;
                }
                curr_count=0;
            }
        }
        return max_count;
    }
}