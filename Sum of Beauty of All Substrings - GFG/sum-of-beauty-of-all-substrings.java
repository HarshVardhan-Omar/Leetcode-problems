//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        // code here
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int[] cnt=new int[26];
            char ch=s.charAt(i);
            cnt[ch-'a']++;
            for(int j=i+1;j<n;j++){
                char ch2=s.charAt(j);
                cnt[ch2-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                // System.out.println(Arrays.toString(cnt));
                for(int k=0;k<26;k++){
                    if(cnt[k] != 0 && cnt[k] > max)max=cnt[k];
                    if(cnt[k] != 0 && cnt[k] < min)min=cnt[k];
                }
                ans+=max-min;
                // System.out.println(ans);
            }
            cnt[ch-'a']--;
        }
        return ans;
    }
}
        
