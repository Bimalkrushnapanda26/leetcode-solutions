class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int start=0;
        int curr_sum=0;
        int end=n-1;
        while(start<end)
        {
            curr_sum=numbers[start]+numbers[end];
            if(curr_sum<target)
            {
                start++;
            }
            else if(curr_sum>target)
            {
                end--;
            }
            else
            {
                break;
            }
        }
        int result[]=new int[2];
        result[0]=start+1;
        result[1]=end+1;
        return result;
    }
}