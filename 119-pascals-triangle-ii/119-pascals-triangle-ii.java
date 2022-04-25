class Solution {
    public List<Integer> getRow(int rowIndex) {
            List<Integer> ans=null;
            List<Integer> prev=new ArrayList<>();
            int i=0;
            while(i <= rowIndex){
                    ans=new ArrayList<>();
                    for(int j=0;j<=i;j++){
                            if(j==0 || j==i){
                                    ans.add(1);
                            }
                            else{
                                    ans.add(prev.get(j-1)+prev.get(j));
                            }
                            
                    }
                    prev=ans;
                    i++;
            }
            return ans;
        
    }
}