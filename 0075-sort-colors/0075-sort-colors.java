class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zero=0;
        int two=n-1;
        int curr=0;
        int temp=0;
        while(curr<=two)
        {
            if(nums[curr]==1)
            {
                curr++;
            }
            else if(nums[curr]==0)
            {
                temp=nums[curr];
                nums[curr]=nums[zero];
                nums[zero]=temp;
                zero++;
                curr++;
            }
            else if(nums[curr]==2)
            {
                temp=nums[curr];
                nums[curr]=nums[two];
                nums[two]=temp;
                two--;
            }
        }
    }
}