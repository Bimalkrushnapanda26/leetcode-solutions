class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int first = 0; first < n - 2; first++) {

            // Skip duplicate first elements
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int start = first + 1;
            int end = n - 1;

            while (start < end) {
                int sum = nums[first] + nums[start] + nums[end];

                if (sum == 0) {
                    ans.add(Arrays.asList(
                        nums[first],
                        nums[start],
                        nums[end]
                    ));

                    start++;
                    end--;

                    // Skip duplicates
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }

                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }

                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return ans;
    }
}