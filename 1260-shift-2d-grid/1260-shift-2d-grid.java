class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        ArrayDeque<Integer> mem = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mem.add(grid[i][j]);
            }
        }
        for(int i=0; i<k%mem.size(); i++) {
            mem.addFirst(mem.removeLast());
        }
        for(int i=0; i<m; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<n; j++) {
                row.add(mem.removeFirst());
            }
            ans.add(row);
        }
        return ans;
    }
}