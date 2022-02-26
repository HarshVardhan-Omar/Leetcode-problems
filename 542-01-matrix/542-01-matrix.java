class Solution {
    
    private static int[][] ways = new int[][]{
      new int[]{1,0},
      new int[]{-1,0},
      new int[]{0,1},
      new int[]{0,-1},
    };
    
    
    public int[][] updateMatrix(int[][] w) {
        Deque<Pair> deque = new ArrayDeque<>();
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {
                if (w[i][j] == 0) {
                    deque.addLast(new Pair(i, j, 0));
                } else {
                    w[i][j] = -1;
                }
            }
        }
        while (!deque.isEmpty()) {
            Pair pair = deque.removeFirst();
            for (int[] way : ways) {
                int i = pair.i + way[0];
                int j = pair.j + way[1];
                if (i >= 0 && j >= 0 && i < w.length && j < w[i].length
                   && w[i][j] == -1) {
                    w[i][j] = pair.level + 1;
                    deque.add(new Pair(i,j,w[i][j]));
                }
            }
        }
        return w;
    }
    
    private static class Pair{
        int i;
        int j;
        int level;
        Pair(int i, int j, int level) {
            this.i = i;
            this.j = j;
            this.level = level;
        }
    }
}