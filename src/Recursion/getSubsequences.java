package Recursion;

import java.util.ArrayList;

public class getSubsequences {

  public static ArrayList<String> generateSubsequences(String str) {
    ArrayList<String> ans = new ArrayList<>();
    helper(str, " ", 0, ans);
    return ans;
  }

  public static void helper(String str, String subSeq, int idx, ArrayList<String> ans) {
    if (idx >= str.length()) {
      ans.add(subSeq);
      return;
    }
    char c = str.charAt(idx);
    // exclude
    helper(str, subSeq, idx + 1, ans);
    // include
    helper(str, subSeq + c, idx + 1, ans);
  }

}
