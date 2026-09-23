class Solution {

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid;

        // Step 1: Find breaking point
        while (start < end) {

            mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                // Breaking point is on the right
                start = mid + 1;
            }
            else {
                // Breaking point is at mid or on the left
                end = mid;
            }
        }

        int breaking_point = start;

        // Step 2: Decide which sorted part to search
        if (target >= nums[breaking_point] && target <= nums[nums.length - 1]) {

            // Right sorted part
            start = breaking_point;
            end = nums.length - 1;

        }
        else {

            // Left sorted part
            start = 0;
            end = breaking_point - 1;
        }

        // Step 3: Normal binary search
        while (start <= end) {

            mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}