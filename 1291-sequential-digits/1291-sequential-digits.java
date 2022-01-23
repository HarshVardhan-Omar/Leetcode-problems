class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
            List<Integer> answer=new ArrayList<>();
            int start=1;int inc=11;int t=8;int cur=1;int k=2;
            while(cur<=high){
                    
                    for(int i=0;i<t;i++){
                            cur+=inc;
                            if(cur>=low&&cur<=high)
                                    answer.add(cur);
                    }
                    // low=cur;
                    start=start*10+k++;
                    cur=start;
                    inc=inc*10+1;
                    t--;
                    
            }
            return answer;
        
    }
}