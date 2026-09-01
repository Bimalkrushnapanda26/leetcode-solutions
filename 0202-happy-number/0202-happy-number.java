class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        if(Squaresum(n)==1)
        {
            return true;
        }
        while(fast!=1 && slow!=1)
        {
            fast=Squaresum(Squaresum(fast));
            slow=Squaresum(slow);
            if(fast==slow)
            {
                return false;
            }
        }
        return true;
    }
    public int Squaresum(int n)
    {
        int sum=0;
        int reminder=0;
        while(n!=0)
        {   
            reminder=n%10;
            sum+=reminder*reminder;
            n=n/10;
        }
        return sum;
    }
}