class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int temp=0;
        for(int i=0;i<row;i++)
        {
            for(int j=i+1;j<row;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++)
        {
            reverse(matrix[i],0,row-1);
        }
    }
    public void reverse(int nums[],int start,int end)
    {
        int temp=0;
        while(start<=end)
        {
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}