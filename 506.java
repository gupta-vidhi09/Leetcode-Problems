import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            int rank = n - i;

            if (rank == 1) {
                map.put(sorted[i], "Gold Medal");
            } else if (rank == 2) {
                map.put(sorted[i], "Silver Medal");
            } else if (rank == 3) {
                map.put(sorted[i], "Bronze Medal");
            } else {
                map.put(sorted[i], String.valueOf(rank));
            }
        }

        String[] ans = new String[n];

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(score[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] score1 = {10, 3, 8, 9, 4};
        String[] result1 = solution.findRelativeRanks(score1);
        System.out.println("Test case 1:");
        System.out.println("Input: " + Arrays.toString(score1));
        System.out.println("Output: " + Arrays.toString(result1));
        System.out.println();
        
        // Test case 2
        int[] score2 = {100, 90, 80, 70};
        String[] result2 = solution.findRelativeRanks(score2);
        System.out.println("Test case 2:");
        System.out.println("Input: " + Arrays.toString(score2));
        System.out.println("Output: " + Arrays.toString(result2));
    }
}