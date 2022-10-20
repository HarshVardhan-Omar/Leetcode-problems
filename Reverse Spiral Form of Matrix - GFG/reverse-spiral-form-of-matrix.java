//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        List<Integer> temp=spiralOrder(a);
        Collections.reverse(temp);
        int[] ans=new int[R*C];
        int k=0;
        for(int i:temp){
            ans[k++]=i;
        }
        return ans;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
            int rowstart=0;
            int colstart=0;
            int rowend=matrix.length-1;
            int colend=matrix[0].length-1;
            List<Integer> ans=new ArrayList<>();
            int way=1;
            while(rowstart<=rowend&&colstart<=colend){
                    if(way==1){
                            for(int i=colstart;i<=colend;i++){
                                    ans.add(matrix[rowstart][i]);
                            }
                            way=2;
                            rowstart++;
                    }
                    else if(way==2){
                            for(int i=rowstart;i<=rowend;i++){
                                    ans.add(matrix[i][colend]);
                            }
                            way=3;
                            colend--;
                    }
                    else if(way==3){
                            for(int i=colend;i>=colstart;i--){
                                    ans.add(matrix[rowend][i]);
                            }
                            way=4;
                            rowend--;
                    }
                    else{
                            for(int i=rowend;i>=rowstart;i--){
                                    ans.add(matrix[i][colstart]);
                            }
                            way=1;
                            colstart++;
                    }
            }
            return ans;
        
    }
}