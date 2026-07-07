class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxarea = 0.0;
        int n  = points.length;
        for(int i=0 ; i < n ; i++){
            for(int j=i+1; j<n ; j++){
                for(int k=j+1; k<n; k++){
                    int x1 = points[i][0];
                    int y1 = points[i][1];

                    int x2 = points[j][0];
                    int y2 = points[j][1];

                    int x3 = points[k][0];
                    int y3 = points[k][1];

                    double area = Math.abs(
                        x1*(y2-y3)+
                        x2*(y3-y1)+
                        x3*(y1-y2)
                    )/2.0;

                    maxarea = Math.max(area,maxarea);
                }
            }
        }
        return maxarea;
    }
}
    class Main {
        public static void main(String[] args) {
            Solution sol = new Solution();
            int[][] points1 = {{0,0},{0,1},{1,0}};
            System.out.println(sol.largestTriangleArea(points1));

            int[][] points2 = {{0,0},{0,2},{2,0},{0,1}};
            System.out.println(sol.largestTriangleArea(points2));
        }
    }