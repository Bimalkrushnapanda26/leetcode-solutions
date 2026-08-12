class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow=false;
        boolean firstcolumn=false;
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            if(matrix[i][0]==0)
            {
                firstcolumn=true;
                break;
            }
        }
        for(int i=0;i<col;i++)
        {
            if(matrix[0][i]==0)
            {
                firstrow=true;
                break;
            }
        }
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<row;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int k=1;k<col;k++)
                {
                    matrix[i][k]=0;
                }
            }
        }
        for(int i=1;i<col;i++)
        {
            if(matrix[0][i]==0)
            {
                for(int k=1;k<row;k++)
                {
                    matrix[k][i]=0;
                }
            }
        }
        if(firstrow)
        {
            for(int i=0;i<col;i++)
            {
                matrix[0][i]=0;
            }
        }
        if(firstcolumn)
        {
            for(int i=0;i<row;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}