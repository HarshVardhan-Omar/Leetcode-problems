class Solution {
        private int getdiff(int[] arr,int target,int s,int value){
                int t=s;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]>=value){
                                t-=(arr[i]-value);
                        }
                }
                return target-t;
        }
    public int findBestValue(int[] arr, int target) {
            int n=arr.length;
            int s=0;
            int max_ele=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                    s+=arr[i];
                    if(arr[i]>max_ele){
                            max_ele=arr[i];
                    }
            }
            int origdiff=Math.abs(target-s);
            if(origdiff==0){
                    return max_ele;
            }
            //Binary Search starts here 
            int start=0;
            int end=max_ele;
            // System.out.println(start+" "+end);
            int ans=Integer.MAX_VALUE;
            while(start<=end){
                    int mid=(start+end)/2;
                    int diff=getdiff(arr,target,s,mid);
                    int ad=Math.abs(diff);
                    if(diff<0){
                            end=mid-1;
                            if(ad<origdiff){
                                    origdiff=ad;
                                    ans=mid;
                            }
                            else if(ad==origdiff){
                                    ans=Math.min(ans,mid);
                            }
                            
                    }
                    else{
                            start=mid+1;
                            if(ad<origdiff){
                                    origdiff=ad;
                                    ans=mid;
                            }
                            else if(ad==origdiff){
                                    ans=Math.min(ans,mid);
                            }
                    }
                    // System.out.println(diff+" "+origdiff+" "+mid);
                    // if(diff<=origdiff){
                    //         ans=mid;
                    //         origdiff=diff;
                    //         end=mid-1;
                    // }
                    // else{
                    //       start=mid+1;  
                    // }
            }
            return ans;
            
        
    }
}