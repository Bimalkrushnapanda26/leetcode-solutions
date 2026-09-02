class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int po1=m-1;
        int po2=n-1;
        int po3=m+n-1;
        while(po1>=0 && po2>=0)
        {
            if(nums1[po1]>nums2[po2])
            {
                nums1[po3]=nums1[po1];
                po3--;
                po1--;
            }
            else
            {
                nums1[po3]=nums2[po2];
                po3--;
                po2--;
            }
        }
        while(po1>=0)
        {
                nums1[po3]=nums1[po1];
                po3--;
                po1--;
        }
        while(po2>=0)
        {
                nums1[po3]=nums2[po2];
                po3--;
                po2--;
        }
    }
}