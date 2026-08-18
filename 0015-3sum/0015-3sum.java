class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int first=0;
        int start=0;
        int end=n-1;
        int temp=0;
        List<List<Integer>> ans = new ArrayList<>();
        while(first<n)
        {
            start=first+1;
            end=n-1;
            while(start<end)
            {
                if(nums[first]+nums[start]+nums[end]==0)
                {
                    List<Integer> numbers = new ArrayList<>();
                    numbers.add(nums[first]);
                    numbers.add(nums[start]);
                    numbers.add(nums[end]);
                    ans.add(numbers);
                    temp=nums[end];
                    while(end>0 && temp==nums[end])
                    {
                        end--;
                    }
                    temp=nums[start];
                    while(start<n && temp==nums[start])
                    {
                        start++;
                    }
                }
                else if(nums[first]+nums[start]+nums[end]>0)
                {
                    temp=nums[end];
                    while(end>0 && temp==nums[end])
                    {
                        end--;
                    }
                }
                else
                {
                    temp=nums[start];
                    while(start<n && temp==nums[start])
                    {
                        start++;
                    }
                }
            }
            temp=nums[first];
            while(first<n && temp==nums[first])
            {
                first++;
            }
        }
        return ans;
    }
}