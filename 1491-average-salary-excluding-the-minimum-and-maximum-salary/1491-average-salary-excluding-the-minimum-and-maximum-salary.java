class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<salary.length;i++){
                    if(salary[i]>max)
                            max=salary[i];
                    if(salary[i]<min)
                            min=salary[i];
            }
            // System.out.println(max+" "+min);
            int s=0;
            for(int i=0;i<salary.length;i++){
                    if(salary[i]!=max&&salary[i]!=min){
                            s+=salary[i];
                    }
            }
            // System.out.println(s);
            double ans=(double)s/(salary.length-2);
            return ans;
    }
}