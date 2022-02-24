class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;
        int src_element = image[sr][sc];//store the prev color of image[sr][sc]
        
        
        // If newColor is equal to previous color of element at [sr,sc] then there is no need of applying DFS as matrix will remain same  
        if(src_element == newColor)
            return image;
        
        Queue<int[]> q=new LinkedList<>();//to store the newly coloured elements's index
        
        image[sr][sc]=newColor;
        
        q.offer(new int[]{sr,sc});
        
        int dx[]={0,0,-1,1};
        int dy[]={-1,1,0,0};
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int p[]=q.poll();
                for(int j=0;j<4;j++)
                {
                    int x=p[0]+dx[j];
                    int y=p[1]+dy[j];
                    if(x<0 || y<0 || x>=n || y>=m || image[x][y]!=src_element)
                        continue;
                    image[x][y]=newColor;
                    q.offer(new int[]{x,y});
                }
            }
        }
        return image;
    }
    
}