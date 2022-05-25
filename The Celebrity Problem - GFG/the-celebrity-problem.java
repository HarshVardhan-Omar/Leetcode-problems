// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    private boolean knows(int[][] M,int a,int b){
        if(M[a][b] == 1){
            return true;
        }
        else{
            return false;
        }
    }
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st=new Stack<>();
    	for(int i=0;i<n;i++){
    	    st.push(i);
    	}
    	
    	while(st.size() > 1){
    	    int a=st.pop();
    	    int b=st.pop();
    	    if(knows(M,a,b)){
    	        st.push(b);
    	    }
    	    else{
    	        st.push(a);
    	    }
    	    
    	}
    	
    	//Check the Celebrity Candidate
    	boolean rowcheck=false;
    	for(int i=0;i<n;i++){
    	    if(i!=st.peek()){
    	    if(M[st.peek()][i] == 1){
    	        rowcheck=true;
    	        break;
    	    }
    	    }
    	}
    	if(rowcheck){
    	   // System.out.println("here1");
    	    return -1;
    	}
    	else{
    	    boolean colcheck=false;
    	    for(int j=0;j<n;j++){
    	        if(j!=st.peek()){
    	        if(M[j][st.peek()] == 0){
    	            colcheck=true;
    	            break;
    	        }
    	        }
    	    }
    	    if(colcheck){
    	       // System.out.println("here2");
    	        return -1;
    	    }
    	}
    	return st.peek();
    }
}