class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
            int n=pushed.length;
            Stack<Integer> st=new Stack<>();
            int i=0;
            int j=0;
            while(i<n&&j<n){
                    while(i<n&&pushed[i]!=popped[j]){
                            st.push(pushed[i]);
                            i++;
                    }
                    if(i<n){
                          st.push(pushed[i]);
                            i++;
                    }
                    
                    // System.out.println(st);
                    if(!st.isEmpty()){
                            st.pop();
                            j++;
                    }
                    
                    while(j<n&&!st.isEmpty()&&popped[j]==st.peek()){
                            st.pop();
                            j++;
                    }
                             
            }
            if(st.isEmpty()){
                    return true;
            }
            return false;
        
    }
}