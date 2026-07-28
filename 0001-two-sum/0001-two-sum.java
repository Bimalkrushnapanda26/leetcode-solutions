class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        int arr[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(!temp.containsKey(target-nums[i]))
            {
                temp.put(nums[i],i);
            }
            else
            {
                arr[0]=temp.get(target-nums[i]);
                arr[1]=i;
            }
        }
        return arr;
    }
}