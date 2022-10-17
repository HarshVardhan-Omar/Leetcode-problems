//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int arr[][])
    {
        int[][] vis=new int[n][n];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j && vis[i][j] != 1){
                    vis[i][j]=1;
                    ans.add(arr[i][j]);
                }
                else{
                    if(vis[i][j] == 0){
                        vis[i][j]=1;
                        ans.add(arr[i][j]);
                        int a=i+1;
                        int b=j-1;
                        while(a < n && b >= 0){
                            vis[a][b]=1;
                            ans.add(arr[a][b]);
                            a++;
                            b--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
