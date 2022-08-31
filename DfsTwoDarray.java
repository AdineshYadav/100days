public class DfsTwoDarray {
    public static void main(String[] args) {

        int [][] grid = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

    }

    public void dfs(int[][] grid){
        int h = grid.length;
        if(h == 0){
            return;
        }
        int l = grid[0].length;

        //create a visited array
        boolean[][] visited = new boolean[h][l];
        System.out.println("Depth first search: ");
         dfsUtil(grid,0,0,visited);
    }

    public void dfsUtil(int[][] grid , int row , int col , boolean[][] visited){
        int h = grid.length;
        int l = grid[0].length;

        
        if(row < 0 || col < 0 || row >= h || col >= l || visited[row][col]){
            return ;
        }

        //mark the cell visited
        visited[row][col]=true;
        System.out.println(grid[row][col]+" ");
        dfsUtil(grid,row+1,col,visited);
        dfsUtil(grid,row-1,col,visited);
        dfsUtil(grid,row,col+1,visited);
        dfsUtil(grid,row+1,col-1,visited);
    }
}
