// class Solution {
//     public void moveZeroes(int[] nums) {
//        int n=nums.length;
//        int i=0;
//        int temp=0;
//        int j=0;
//        if(n==1)
//        {
  
//        }
//        else
//        { 
//             for(int k=0;k<n;k++)
//               {
//                 if(nums[k]==0)
//                 {
//                     i=k;
//                     break;
//                 }
//               }
//               if(i<n-1)
//               {
//                 j=i+1;
//               }
//         while(j<n)
//         {
//               if(nums[j]!=0)
//               {
//                 temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 j++;
//                 i++;
//               }
//               else
//               {
//                 j++;
//               }
//         }        
//        }  
//     }
// }
class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;   // Position where the next non-zero should go

        for (int j = 0; j < nums.length; j++) {

            // If current element is non-zero
            if (nums[j] != 0) {

                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move i to the next position
                i++;
            }
        }
    }
}