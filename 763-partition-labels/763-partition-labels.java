class Solution {
    public List<Integer> partitionLabels(String s) {
            int n=s.length();
            int[] lastindex=new int[26];
            List<Integer> ans=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                    lastindex[s.charAt(i)-'a']=i;
            }
            int prevlast=-1;
            int start=0;
            int end=lastindex[s.charAt(start)-'a'];
            int size=0;
            int temp=start;
            while(temp<n&&end<n){
                    if(temp==end){
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