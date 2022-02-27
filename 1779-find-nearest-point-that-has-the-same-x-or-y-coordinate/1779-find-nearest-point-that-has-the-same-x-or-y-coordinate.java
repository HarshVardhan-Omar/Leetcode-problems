class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int n=points.length;
            int min_dist=Integer.MAX_VALUE;
            int dist=0;
            int ans=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                    int point1=points[i][0];
                    int point2=points[i][1];
                    if(point1==x||point2==y){
                            dist=Math.abs(point1-x)+Math.abs(point2-y);
                            if(dist<min_dist){
                                    min_dist=dist;
                                    ans=i;
                                    flag=true;
                            }
                    }
            }
            return flag?ans:-1;
    }
}