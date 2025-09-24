package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class distributionOfCandies {

  public int candies(ArrayList<Integer> A, int n) {
    // make left array
    int[] left = new int[n];
    Arrays.fill(left, 1);
    for (int i = 1; i < n; i++) {
      left[i] = left[i - 1] + 1;
    }
    // make rigth array
    int[] right = new int[n];
    Arrays.fill(right, 1);
    for (int i = n - 2; i >= 0; i--) {
      right[i] = right[i + 1] + 1;
    }
    int ans = 0;
    // now store max candy
    for (int i = 0; i < n; i++) {
      ans += Math.max(left[i], right[i]);
    }
    return ans;

  }

}
