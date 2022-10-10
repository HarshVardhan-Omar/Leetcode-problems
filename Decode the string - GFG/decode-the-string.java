//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        int n=s.length();
        Stack<StringBuilder> str=new Stack<>();
        Stack<Integer> st=new Stack<>();
        StringBuilder currstr=new StringBuilder("");
        int k=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }
            else if(Character.isLetter(c)){
                currstr.append(c);
            }
            else if(c == '['){
                st.push(k);
                str.push(currstr);
                k=0;
                currstr=new StringBuilder();
            }
            else if(c == ']'){
                StringBuilder temp=currstr;
                int freq=st.pop();
                currstr=str.pop();
                while(freq>0){
                    currstr.append(temp);
                    freq--;
                }
                k=0;
            }
        }
        return currstr.toString();
    }
}