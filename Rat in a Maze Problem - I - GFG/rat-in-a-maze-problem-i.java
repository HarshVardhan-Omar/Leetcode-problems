// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans=new ArrayList<>();
        if(m[0][0]==0){
            return ans;
        }
        String direction="";
        int[][] visited=new int[n][n];
        
        //Intialize visited
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                visited[i][j]=0;
            }
        }
        int irow=0;
        int icol=0;
        solve(m,n,irow,icol,direction,ans,visited);
        return ans;
    }
    private static boolean isSafe(int x,int y,int n,int[][] visited,int[][] m){
        if( (x>=0&&x<n) && (y>=0&&y<n) && (visited[x][y]==0) && (m[x][y]==1) ){
            return true;
        }
        else{
            return false;
        }
    }
    private static void solve(int[][] m,int n,int irow,int icol,String direction,ArrayList<String> ans,int[][] visited){
        if(irow==n-1&&icol==n-1){
            ans.add(new String(direction));
            return;
        }
        visited[irow][icol]=1;
        //Checking Up direction
        if(isSafe(irow-1,icol,n,visited,m)){
            direction+="U";
            solve(m,n,irow-1,icol,direction,ans,visited);
            direction=direction.substring(0,direction.length()-1);
        }
        //Checking down direction
        if(isSafe(irow+1,icol,n,visited,m)){
            direction+="D";
            solve(m,n,irow+1,icol,direction,ans,visited);
            direction=direction.substring(0,direction.length()-1);
        }
        //Checking left direction
        if(isSafe(irow,icol-1,n,visited,m)){
            direction+="L";
            solve(m,n,irow,icol-1,direction,ans,visited);
            direction=direction.substring(0,direction.length()-1);
        }
        //Checking right direction
        if(isSafe(irow,icol+1,n,visited,m)){
            direction+="R";
            solve(m,n,irow,icol+1,direction,ans,visited);
            direction=direction.substring(0,direction.length()-1);
        }
        visited[irow][icol]=0;
    }
}