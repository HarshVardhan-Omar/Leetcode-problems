class Solution {
   private ArrayList<Integer> nextSmallerElement(int[] arr,int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(-1);
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int ele=arr[i];
            //hame push kab krna hai
            if(st.isEmpty() || ele>=arr[st.peek()]){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && ele<arr[st.peek()]){
                    ans.set(st.peek(),i);
                    st.pop();
                }
                st.push(i);
            }
        }
      return ans;
   }
   private ArrayList<Integer> prevSmallerElement(int[] arr,int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(-1);
        }
        Stack<Integer> st=new Stack<>();
        for(int i=n-1; i>=0; i--){
            int ele=arr[i];
            //hame push kab krna hai
            if(st.isEmpty() || ele>=arr[st.peek()]){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && ele<arr[st.peek()]){
                    ans.set(st.peek(),i);
                    st.pop();
                }
                st.push(i);
            }
        }
      return ans;
           
   }
    public int largestRectangleArea(int[] heights) {
            int n=heights.length;
            ArrayList<Integer> next=new ArrayList<>();
            ArrayList<Integer> prev=new ArrayList<>();
            
            next=nextSmallerElement(heights,n);
            prev=prevSmallerElement(heights,n);
            // System.out.println(next);
            // System.out.println(prev);
            int maxarea=Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                    int l=heights[i];
                    
                    if(next.get(i) == -1){
                            next.set(i,n);
                    }
                    int b=next.get(i)-prev.get(i)-1;
                    int newarea=l*b;
                    maxarea=Math.max(maxarea,newarea);
            }
            return maxarea;
        
    }
}