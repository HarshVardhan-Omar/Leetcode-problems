class Solution {
    public int divide(int dividend, int divisor) {
            
            if(dividend==-2147483648&&divisor==-1)
                    return 2147483647;
            int answer=(int) dividend/divisor;
            // System.out.println(answer);
            if(answer<Integer.MIN_VALUE){
                    System.out.println("min");
                    return Integer.MIN_VALUE;
            }
            else if(answer>Integer.MAX_VALUE){
                    System.out.println("max");
                    return Integer.MAX_VALUE;
            }
            return answer;
        
    }
}