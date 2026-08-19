class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int first=0;
        int second=0;
        int start=0;
        int end=0;
        int n=nums.length;
        long sum=0;
        int flag=0;
        while(first<n-3)
        {
            second=first+1;
            while(second<n-2)
            {
                start=second+1;
                end=n-1;
                while(start<end)
                {
                    sum=(long)nums[start]+nums[end]+nums[first]+nums[second];
                    if(sum==target)
                    {
                        List<Integer> row=new ArrayList<>();
                        row.add(nums[first]);
                        row.add(nums[second]);
                        row.add(nums[start]);
                        row.add(nums[end]);
                        ans.add(row);
                        flag=0;
                        start=skip(nums,nums[start],flag,start,n);
                        flag=1;
                        end=skip(nums,nums[end],flag,end,n);
                    }
                    else if(sum>target)
                    {
                        flag=1;
                        end=skip(nums,nums[end],flag,end,0);
                    }
                    else
                    {
                        flag=0;
                        start=skip(nums,nums[start],flag,start,n);
                    }
                }
                flag=0;
                second=skip(nums,nums[second],flag,second,n-2);
            }
            flag=0;
            first=skip(nums,nums[first],flag,first,n-3);
        }
        return ans;
    }
    public int skip(int[] nums,int temp,int flag,int pointer,int n)//if "flag=0" then it will do handel the ++ if flag=1 then it will handel the --"
    {
        if(flag==0)
        {
            while(pointer<n && nums[pointer]==temp)
            {
                pointer++;
            }
        }
        else if(flag==1)
        {
             while(pointer>0 && nums[pointer]==temp)
            {
                pointer--;
            }
        }
        return pointer;
    }
}