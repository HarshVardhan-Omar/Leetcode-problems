class Solution {
    public int removeElement(int[] nums, int val) {
            int n=nums.length;
            int c=0;
            int i=0;
            int temp=n;
            while(i<temp){
                    while(nums[i]==val){
                            c++;
                            for(int j=i;j<=n-2;j++){
                                    nums[j]=nums[j+1];
                            }
                            
                            if(i==temp-1){
                                    break;
                            }
                            temp--;
                    }
                    // System.out.println(i);
                    i++;       
            }
            // System.out.println(Arrays.toString(nums));
            // System.out.println(n-c);
            return n-c;    
    }
}