//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean canPair(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        if(n % 2 != 0)return false;
        int s=0;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]%k;
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        if(s % k != 0)return false;
        
        for(int i:nums){
            if(i == 0){
                if(mp.get(i) % 2 != 0)return false;
            }
            else{
                if(!mp.containsKey(k-i))return false;
                if(mp.get(i) != mp.get(k-i))return false;
            }
        }
        return true;
        
        
    }
}