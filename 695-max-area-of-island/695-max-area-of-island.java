class Solution {
	public int maxAreaOfIsland(int[][] grid) {
		int maxArea = 0;
		for(int i = 0; i < grid.length; i ++) {
			for(int j = 0; j < grid[0].length; j ++) {
				if(grid[i][j] == 1) {
					int area = areaOfIsland(grid, i, j);
					if(area > maxArea) {
						maxArea = area;
					}
				}
			}
		}
		return maxArea;
	}

	public int areaOfIsland(int[][] grid, int x, int y) {
		int area = 1;
		grid[x][y] = 0;
		if(validCoord(grid, x - 1, y) && grid[x - 1][y] == 1){
			area += areaOfIsland(grid, x - 1, y);
		}
		if(validCoord(grid, x + 1, y) && grid[x + 1][y] == 1){
			area += areaOfIsland(grid, x + 1, y);
		}
		if(validCoord(grid, x, y + 1) && grid[x][y + 1] == 1 ){
			area += areaOfIsland(grid, x, y + 1);
		}
		if(validCoord(grid, x, y - 1) && grid[x][y - 1] == 1) {
			area += areaOfIsland(grid, x, y - 1);
		}
		return area;
	}

	public boolean validCoord(int[][]grid, int x, int y){
		if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length){
			return false;
		}
		return true;
	}
}