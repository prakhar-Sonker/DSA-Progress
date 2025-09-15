class Solution {
    public int findMin(int[] nums) {
        return find(nums, nums.length, 0);
    }

    int find(int[] nums, int size, int idx) {
        // base case → last element is the min of that subarray
        if (idx == size - 1) {
            return nums[idx];
        }

        // recursive case
        int min = find(nums, size, idx + 1);
        return Math.min(min, nums[idx]);
    }
}
