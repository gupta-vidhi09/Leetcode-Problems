import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter heights separated by spaces:");
        String line = in.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("0");
            in.close();
            return;
        }

        String[] parts = line.split("\\s+");
        int[] heights = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            heights[i] = Integer.parseInt(parts[i]);
        }

        Solution sol = new Solution();
        int result = sol.heightChecker(heights);
        System.out.println(result);
        in.close();
    }
}