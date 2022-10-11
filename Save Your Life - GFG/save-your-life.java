//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(x[i],b[i]);
        }
        
        int a=w.length();
        if(a == 1)return w;
        int sum=0;
        int newindex=0;
        int lastgood=0;
        int breakindex=-1;
        String temp="";
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<a;i++){
            char ch=w.charAt(i);
            if(mp.containsKey(ch)){
                sum+=mp.get(ch);
            }
            else{
                sum+=(int)ch;
            }
            if(sum < 0){
                maxsum=Math.max(maxsum,sum);
                sum=0;
                breakindex=i;
            }
            else{
                if(sum > maxsum){
                    temp=w.substring(breakindex+1,i+1);
                }
                maxsum=Math.max(maxsum,sum);
                
            }
        }
        return temp;
        
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends