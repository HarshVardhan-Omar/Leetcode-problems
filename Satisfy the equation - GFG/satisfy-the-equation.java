//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            int[] ptr = ob.satisfyEqn(A,N);
            
            System.out.println(ptr[0] + " " + ptr[1] + " " + ptr[2] + " " + ptr[3]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Pair

{

    int start;

    int end;

    Pair(int start,int end)

    {

        this.start=start;

        this.end=end;

    }

}

class Solution {

    static int[] satisfyEqn(int[] a, int n) {

        

        HashMap<Integer,Pair>h=new HashMap<Integer,Pair>();

        int prev[]={9999,9999,9999,9999};

        

        for(int i=0;i<n-1;i++)

        {

            for(int j=i+1;j<n;j++)

            {

             int sum=a[i]+a[j];

             if(h.containsKey(sum)==false)

             {

                 h.put(sum,new Pair(i,j));

                 continue;

             }

            else if(h.containsKey(sum) )

             {

                 int curr[]=new int [4];

                 Pair temp=h.get(sum);

                 if(temp.start!=i && temp.end!=j && temp.start!=j && temp.end!=i){

                 curr[0]=temp.start;

                 curr[1]=temp.end;

                 curr[2]=i;

                 curr[3]=j;

                 for(int id=0;id<4;id++)

                 {

                     if(prev[id]>curr[id])

                     {

                         prev=curr;

                         break;

                     }

                     else if(prev[id]<curr[id]) {

                         break;

                     }

                 }

                 }

             }

            }

        }

        if(prev[0]==9999)

        {

            int prev1[]={-1,-1,-1,-1};

            return prev1;

        }

        return prev;

    }

};