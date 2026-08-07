class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int curr_count=0;
        int max=Integer.MIN_VALUE;
        if(n==0)
        {
            return 0;
        }
        for(Integer num : set)
        {
            if(set.contains(num-1))
            {
                continue;
            }
            else
            {
                curr_count=1;
                while(set.contains(num+curr_count))
                {
                    curr_count++;
                }
            }
            max=Math.max(curr_count,max);
        }
        return max;
    }
}