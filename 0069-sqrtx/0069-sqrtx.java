class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        int mid=0;
        int ans=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            long square = (long) mid * mid;
            if(square<=x)
            {
                ans=mid;
                start=mid+1;
            }
            else if(square>x)
            {
                end=mid-1;
            }
        }
        return ans;
    }
}