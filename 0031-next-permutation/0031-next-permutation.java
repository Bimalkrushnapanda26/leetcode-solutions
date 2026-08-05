class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        int temp=0;
        int next_greater=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                break;
            }
        }
        if(pivot==-1)
        {
            reverse(nums,0,n-1);
        }
        else
        {
            for(int j=n-1;j>0;j--)
            {
                if(nums[pivot]<nums[j])
                {
                    temp=nums[pivot];
                    nums[pivot]=nums[j];
                    nums[j]=temp;
                    break;
                }
            }
            reverse(nums,pivot+1,n-1);
        }
    }
    public void reverse(int[] arr,int start,int end)
    {
        int temp=0;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}