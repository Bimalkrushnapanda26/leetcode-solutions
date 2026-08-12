class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int ps[]=new int[n];
        int count=0;
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
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(ps[i]==k)
            {
                count+=1;
            }
            if(!map.containsKey(ps[i]-k))
            {
                if(map.containsKey(ps[i]))
                {
                    map.put(ps[i],map.get(ps[i])+1);
                }
                else
                {
                    map.put(ps[i],1);
                }
            }
            else
            {
                count+=map.get(ps[i]-k);
                if(map.containsKey(ps[i]))
                {
                    map.put(ps[i],map.get(ps[i])+1);
                }
                else
                {
                    map.put(ps[i],1);
                }
            }
        }
        return count;

    }
}