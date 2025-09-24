package Greedy;

class maximumActivity {
   public static int solve(int start[], int end[], int n) {
      // make a 2d array for start and end
      int[][] activity = new int[n][2];
      // fill the value in it
      for (int i = 0; i < n; i++) {
         activity[i][0] = start[i];
         activity[i][1] = end[i];
      }
      // now sort them on the basis of end
      Arrays.sort(activity, (a, b) -> a[1] - b[1]);
      // we will add first entry ourself and inc the count of ans by 1
      int currTime = activity[0][1];
      int ans = 1;
      // now we will loop from i=1
      for (int i = 1; i < n; i++) {
         if (activity[i][0] > currTime) {
            currTime = activity[i][1]; // updated the end time
            ans++;
         }
      }
      return ans;

   }
}
