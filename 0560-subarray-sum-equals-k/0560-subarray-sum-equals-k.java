class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int ps[]=new int[n];//it is used to store the prefix sum
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                ps[i]=nums[i];
            }
            else
            {
                ps[i]=ps[i-1]+nums[i];
            }
        }
        HashMap<Integer,Integer> prefixsum_count = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(ps[i]==k)
            {
                count+=1;
            }
            if(!prefixsum_count.containsKey(ps[i]-k))
            {
                if(prefixsum_count.containsKey(ps[i]))
                {
                    prefixsum_count.put(ps[i],prefixsum_count.get(ps[i])+1);
                }
                else
                {
                    prefixsum_count.put(ps[i],1);
                }
            }
            else{
                count+=prefixsum_count.get(ps[i]-k);
                if(prefixsum_count.containsKey(ps[i]))
                {
                    prefixsum_count.put(ps[i],prefixsum_count.get(ps[i])+1);
                }
                else
                {
                    prefixsum_count.put(ps[i],1);
                }
            }
        }
        return count;
    }
}