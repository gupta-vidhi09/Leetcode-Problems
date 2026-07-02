class Solution {
    public int islandPerimeter(int[][] grid) {
        int land=0;
        int neighbours=0;
        int rows=grid.length;
        int cols=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    land++;

                    if(i+1<rows && grid[i+1][j]==1){
                        neighbours++;
                    }
                    if(j+1<cols && grid[i][j+1]==1){
                        neighbours++;
                    }
                }
            }
        }
        return land*4 - neighbours*2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid1 = {{0,1,0,0},
                         {1,1,1,0},
                         {0,1,0,0},
                         {1,1,0,0}};
        System.out.println("Test case 1: " + solution.islandPerimeter(grid1));
        
        int[][] grid2 = {{1}};
        System.out.println("Test case 2: " + solution.islandPerimeter(grid2));
       
        int[][] grid3 = {{1,1}};
        System.out.println("Test case 3: " + solution.islandPerimeter(grid3));
    }
}