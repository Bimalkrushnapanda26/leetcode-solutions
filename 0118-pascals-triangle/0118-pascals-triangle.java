class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
             List<Integer> row = new ArrayList<>();
             for(int k=0;k<=i;k++)
             {
                if(k==0 || k==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(ans.get(i - 1).get(k-1)+ans.get(i - 1).get(k));
                }
             }
             ans.add(row);
        }
        return ans;
    }
}