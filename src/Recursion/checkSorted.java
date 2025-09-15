class Solution {
  public boolean isSorted(int[] nums) {
    // write your recursive solution here
    int idx = 1;
    return helper(nums, nums.length, 1);
  }

  public boolean helper(int[] nums, int size, int idx) {
    // base case
    if (idx >= size)
      return true;
    // processing
    if (nums[idx] > nums[idx - 1]) {
      // now recursion will check
      boolean nextAns = helper(nums, size, idx + 1);
      return nextAns;
    } else
      return false;
  }
}
