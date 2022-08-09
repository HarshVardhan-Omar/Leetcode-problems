class Solution {
    public int findCircleNum(int[][] isConnected) {
            int V=isConnected.length;
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for(int i=0;i<V;i++){
                    adj.add(new ArrayList<>());
            }
            //Convert adjacency list to matrix
            
           for(int i=0;i<V;i++){
                   for(int j=0;j<V;j++){
                           if(isConnected[i][j] == 1 && i != j) {
                                   adj.get(i).add(j);
                                   adj.get(j).add(i);
                           }
                   }
           }
            
           int cnt=0;
           boolean[] vis=new boolean[V+1];
            for(int i=0;i<V+1;i++){
                    vis[i]=false;
            }
            
            for(int i=0;i<V;i++){
                    if(!vis[i]){
                            cnt++;
                            dfs(i,adj,vis,V);
                    }
            }
            return cnt;
        
    }
    private static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis,int V){
            vis[node]=true;
            for(Integer i:adj.get(node)){
                    if(!vis[i]){
                            dfs(i,adj,vis,V);
                    }
            }
    }
}