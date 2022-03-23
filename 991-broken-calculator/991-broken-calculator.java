class Solution {
    public int brokenCalc(int startvalue, int target) {
            int ops=0;
            while(target>startvalue){
                    ops++;
                    if(target%2==1){
                            target++;
                    }
                    else{
                            target/=2;
                    }
                    
            }
            return ops+(startvalue-target);
        
    }
}