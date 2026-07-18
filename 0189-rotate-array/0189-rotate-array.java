class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(n-k,n-1,nums);
        reverse(0,n-1-k,nums);
        reverse(0,n-1,nums);

    }
    public void reverse(int start,int end,int[] nums)
    {
        int temp=0;
        while(start<end)
        {
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}