// { Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        int s=0;
        int e=n-1;
        int ans=-1;
        if(n==1){
            return arr[0]==0?-1:0;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==0){
                s=mid+1;
            }
            else{
                ans=mid;
                e=mid-1;
            }
        }
        
        return ans;
    }
}