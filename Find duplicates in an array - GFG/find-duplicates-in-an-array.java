// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
         HashMap<Integer,Integer> mp=new HashMap<>();
         ArrayList<Integer> ans=new ArrayList<>();
         for(int i=0;i<n;i++){
             mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
         }
        //  System.out.println(mp);
         for(int i:mp.keySet()){
             if(mp.get(i)>1){
                 ans.add(i);
             }
             
         }
         if(ans.size()==0){
             ans.add(-1);
         }
         Collections.sort(ans);
         return ans;
    }
}
