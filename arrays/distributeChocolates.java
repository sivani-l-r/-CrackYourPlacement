import java.util.Arrays;

public class Solution {
    public int findMinDiff(int[] A, int N, int M) {
        // Sort the array
        Arrays.sort(A);

        // Initialize the minimum difference to a large value
        int minDiff = Integer.MAX_VALUE;

        // Find the minimum difference between maximum and minimum of M packets
        for (int i = 0; i <= N - M; i++) {
            int diff = A[i + M - 1] - A[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int N = A.length;
        int M = 5;
        int result = solution.findMinDiff(A, N, M);
        System.out.println("The minimum difference is: " + result); // Output: 6
    }
}
