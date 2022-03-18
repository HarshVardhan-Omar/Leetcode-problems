class Solution {
    public String removeDuplicateLetters(String s) {
            int n = s.length();
            
            boolean[] visited=new boolean[26];
            int[] lastindex=new int[26];
            
            for(int i=0;i<n;i++){
                    lastindex[s.charAt(i)-'a']=i;
            }
            Stack<Character> st=new Stack<>();
            for(int i=0;i<n;i++){
                    char c=s.charAt(i);
                    if(visited[c-'a'])continue;
                    
                    visited[c-'a']=true;
                    
                    while(!st.isEmpty()&&st.peek()>c&&lastindex[st.peek()-'a']>i){
                            visited[st.pop()-'a']=false;
                    }
                    st.push(c);
                    
            }
            // System.out.println(st);
            StringBuilder ans=new StringBuilder("");
            for(char l:st){
                    ans.append(l);
            }
            return ans.toString();
        
    }
}