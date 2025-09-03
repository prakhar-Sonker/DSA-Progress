package Recursion;

public class maximizeTheCutSegments {

  // User function Template for Java

  class Solution {
    // Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z) {
      // Your code here
      if (n == 0)
        return 0;
      if (n < 0)
        return Integer.MIN_VALUE;

      int opx = 1 + maximizeCuts(n - x, x, y, z);
      int opy = 1 + maximizeCuts(n - y, x, y, z);
      int opz = 1 + maximizeCuts(n - z, x, y, z);
      int finalAns = Math.max(opx, Math.max(opy, opz));
      return finalAns < 0 ? 0 : finalAns;

    }
  }

}
