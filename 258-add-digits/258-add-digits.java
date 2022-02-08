class Solution {
    public int addDigits(int num) {
            int sum=0;
            while(num>0){
                    sum+=num%10;
                    num=num/10;
            }
            return findsum(sum);
        
    }
    private int findsum(int sum){
            if(sum<10){
                    return sum;
            }
            int sum1=0;
            while(sum>0){
                    sum1+=sum%10;
                    sum=sum/10;
            }
            
            return findsum(sum1);
    }
}