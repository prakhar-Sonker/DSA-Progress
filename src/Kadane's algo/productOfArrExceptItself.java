import java.util.*;
import java.lang.*;
import java.io.*;

public class productOfArrExceptItself {
  public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int nums[] = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    Solution obj = new Solution();
    long ans[] = obj.ProductOfArrayExceptSelf(n, nums);
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}

class Solution {
  public long[] ProductOfArrayExceptSelf(int n, int[] a) {
    // write code here
    long[] arr = new long[n];
    // prefix product array
    arr[0] = 1;
    for (int i = 1; i < n; i++) {
      arr[i] = arr[i - 1] * a[i - 1];
    }
    // suffix product
    int suffix = 1;
    for (int i = n - 1; i >= 0; i--) {
      arr[i] = suffix * arr[i];
      suffix *= a[i];
    }
    return arr;
  }
}