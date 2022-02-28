class Solution{ 
public int arraySign(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i==0) return 0;
            else if(i<0) c++;
            else continue;
        }
        return (c&1)==0?1:-1;
    }
}