class Solution {
    
    public int x = 0;
    public int y = 1;
    
    public int minCostConnectPoints(int[][] points) {
        
        int n = points.length;
        boolean[] visited = new boolean[points.length];
        int[] dist = new int[points.length];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] = 0;
        
        for(int i = 0; i<n-1; i++){
            
            int minD = Integer.MAX_VALUE;
            int u = 0;
            
            for(int v = 0; v<n; v++){
                if(visited[v]==false && dist[v]<minD){
                    minD = dist[v];
                    u = v;
                }
            }
            
            visited[u] = true;
            int originX = points[u][x];
            int originY = points[u][y];
            for(int v = 0; v<n; v++){
                int destX = points[v][x];
                int destY = points[v][y];
                int nodeDist = Math.abs(originX-destX) + Math.abs(originY-destY);
                if(visited[v]==false && nodeDist<dist[v]){
                    dist[v] = nodeDist;
                }
            }
            
        }
        int sum = 0;
        for(int d:dist){
            sum+= d;
        }
        return sum;        
    }
}