//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int nums[], int n) {
        int i=0;
        while(i<n){
            int corindex=nums[i]-1;
            if(nums[corindex] != nums[i]){
                int temp=nums[corindex];
                nums[corindex]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        int[] ans=new int[2];
        for(int j=0;j<n;j++){
            if(nums[j] != j+1){
                ans[0]=nums[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
}