class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
            List<Boolean> ans=new ArrayList<>();
            for(int i=0;i<l.length;i++){
                    int start=l[i];
                    int end=r[i];
                    int[] temp=new int[end-start+1];
                    int index=0;
                    for(int k=start;k<=end;k++){
                            temp[index++]=nums[k];
                    }
                    int diff=0;
                    int prev_diff=Integer.MIN_VALUE;
                    boolean flag=false;
                    for(int j=0;j<temp.length-1;j++){
                            Arrays.sort(temp);
                            diff=temp[j+1]-temp[j];
                            // System.out.println(diff);
                            if(prev_diff==Integer.MIN_VALUE||diff==prev_diff){
                                    prev_diff=diff;
                            }
                            else{
                                    flag=true;
                                    break;
                            }
                    }
                    ans.add(flag?false:true);
            }
            return ans;
    }
}