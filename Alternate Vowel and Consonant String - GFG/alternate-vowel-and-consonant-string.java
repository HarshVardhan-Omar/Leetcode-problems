//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.rearrange(S, N);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String rearrange(String s, int n){
        TreeMap<Character,Integer> vow=new TreeMap<>();
        TreeMap<Character,Integer> cons=new TreeMap<>();
        if(n == 1)return s;
        int v=0,co=0;
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                vow.put(ch,vow.getOrDefault(ch,0)+1);
                v++;
            }
            else{
                cons.put(ch,cons.getOrDefault(ch,0)+1);
                co++;
            }
        }
        if(Math.abs(v-co)>1)return "-1";
        char[] ans=new char[n];
        if(v > co){
            int i=0;
            for(char c:vow.keySet()){
                int val=vow.get(c);
                while(val > 0){
                    ans[i]=c;
                    val--;
                    i+=2;
                }
            }
            int j=1;
            for(char c:cons.keySet()){
                int val=cons.get(c);
                while(val > 0){
                    ans[j]=c;
                    val--;
                    j+=2;
                }
            }
            
        }
        else if(v < co){
            int i=1;
            for(char c:vow.keySet()){
                int val=vow.get(c);
                while(val > 0){
                    ans[i]=c;
                    val--;
                    i+=2;
                }
            }
            int j=0;
            for(char c:cons.keySet()){
                int val=cons.get(c);
                while(val > 0){
                    ans[j]=c;
                    val--;
                    j+=2;
                }
            }
            
        }
        else{
            if(vow.firstKey() > cons.firstKey()){
                int i=1;
                for(char c:vow.keySet()){
                    int val=vow.get(c);
                    while(val > 0){
                        ans[i]=c;
                        val--;
                        i+=2;
                    }
                }
                int j=0;
                for(char c:cons.keySet()){
                    int val=cons.get(c);
                    while(val > 0){
                        ans[j]=c;
                        val--;
                        j+=2;
                    }
                }
            }
            else{
                int i=0;
                for(char c:vow.keySet()){
                    int val=vow.get(c);
                    while(val > 0){
                        ans[i]=c;
                        val--;
                        i+=2;
                    }
                }
                int j=1;
                for(char c:cons.keySet()){
                    int val=cons.get(c);
                    while(val > 0){
                        ans[j]=c;
                        val--;
                        j+=2;
                    }
                }
            }
        }
        return new String(ans);
        
    }
    private boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')return true;
        return false;
    }
}