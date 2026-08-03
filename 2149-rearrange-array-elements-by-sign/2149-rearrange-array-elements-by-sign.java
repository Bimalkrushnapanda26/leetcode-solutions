class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int positive[]=new int[n/2];
        int negetive[]=new int[n/2];
        int pos=0;
        int neg=0;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                positive[pos]=nums[i];
                pos++;
            }
            else
            {
                negetive[neg]=nums[i];
                neg++;
            }
        }
        // now merge the two array
        pos=0;
        neg=0;
        int pointer=0;
        while(pos<positive.length || neg<negetive.length)
        {
            if(flag==0)
            {
                nums[pointer]=positive[pos];
                pos++;
                pointer++;
                flag=1;
            }
            else if(flag==1)
            {
                nums[pointer]=negetive[neg];
                neg++;
                pointer++;
                flag=0;
            }
        }
        return nums;
    }
}