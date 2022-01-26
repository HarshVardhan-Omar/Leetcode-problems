class Solution {
    public int fib(int n) {
            if(n==0)
                    return 0;
            if(n==1)
                    return 1;
            
            int a=0;int b=1;
            int c=a+b;
            for(int i=3;i<=n;i++){
                    // System.out.println(a+""+b+""+c);
                    int temp=b;
                    b=c;
                    a=temp;
                    c=a+b;
            }
            return c;
        
    }
}