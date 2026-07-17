class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int po1=0;
        int po2=1;
        int curr_ele=nums[po1];
        while(po2<n)
        {
            if(nums[po2]==curr_ele)
            {
                po2++;
                continue;
            }
            else
            {
                curr_ele=nums[po2];
                po1++;
                nums[po1]=curr_ele;
            }
        }
        return po1+1;
    }
}