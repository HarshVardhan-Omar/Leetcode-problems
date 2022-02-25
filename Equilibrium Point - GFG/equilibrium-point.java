// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        long s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
        }
        //Checking for the first element
        long leftsum=0;
        long rightsum=s-arr[0];
        if(leftsum==rightsum){
            return 1;
        }
        rightsum=0;
        //Checking for 1->n-1 index
        for(int i=1;i<n-1;i++){
            leftsum+=arr[i-1];
            rightsum=s-(leftsum+arr[i]);
            if(leftsum==rightsum){
                return i+1;
            }
        }
        //Checking for last element
        leftsum+=arr[n-2];
        rightsum=0;
        if(leftsum==rightsum){
            return n;
        }
        return -1;
    }
}
