class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int y1 = points[0][1];

        int x2 = points[1][0];
        int y2 = points[1][1];

        int x3 = points[2][0];
        int y3 = points[2][1];

        return (y2 - y1) * (x3 - x2) !=
               (y3 - y2) * (x2 - x1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] points1 = {{1, 0}, {0, 0}, {0, 1}};
        System.out.println("Test 1: " + solution.isBoomerang(points1));

        int[][] points2 = {{0, 0}, {1, 1}, {2, 2}};
        System.out.println("Test 2: " + solution.isBoomerang(points2));

        int[][] points3 = {{1, 1}, {1, 0}, {2, 1}};
        System.out.println("Test 3: " + solution.isBoomerang(points3));

        int[][] points4 = {{0, 0}, {0, 0}, {1, 1}};
        System.out.println("Test 4: " + solution.isBoomerang(points4));
    }
}