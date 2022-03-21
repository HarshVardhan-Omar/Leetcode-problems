class Solution {
    public List<Integer> partitionLabels(String s) {
            int n=s.length();
            int[] lastindex=new int[26];
            int[] visited=new int[26];
            List<Integer> ans=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                    lastindex[s.charAt(i)-'a']=i;
            }
            // System.out.println(Arrays.toString(lastindex));
            int prevlast=-1;
            int start=0;
            int end=lastindex[s.charAt(start)-'a'];
            // System.out.println(end);
            int size=0;
            int temp=start;
            // visited[s.charAt(0)-'a']=1;
            while(temp<n&&end<n){
                    if(visited[s.charAt(temp)-'a']==1){
                            if(temp==end){
                            // System.out.println("hi");
                            size=end-start+1;
                            ans.add(size);
                            start=temp+1;
                            if(start<n){
                            end=lastindex[s.charAt(start)-'a'];
                            }
                            temp=start;
                            size=0;
                            prevlast=-1;
                            continue;     
                            }
                            temp++;
                            continue;
                    }
                    
                    visited[s.charAt(temp)-'a']=1;
                    // System.out.println(temp+" "+end);
                    if(temp==end){
                            // System.out.println("hi");
                            size=end-start+1;
                            ans.add(size);
                            start=temp+1;
                            if(start<n){
                            end=lastindex[s.charAt(start)-'a'];
                            }
                            temp=start;
                            size=0;
                            prevlast=-1;
                            continue;
                    }
                    if(lastindex[s.charAt(temp)-'a']>prevlast){
                            prevlast=lastindex[s.charAt(temp)-'a'];
                            end=prevlast;
                    }
                    temp++;
                    
                    
            }
            return ans;
        
    }
}