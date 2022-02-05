class Solution {
    public int minimumSum(int num) {
            int[] arr=new int[4];
            int k=0;
            while(num>0){
                    arr[k++]=num%10;
                    num=num/10;
            }
            Arrays.sort(arr);
            int first=arr[0]*10+arr[3];
            int second=arr[1]*10+arr[2];
            return first+second;
        
    }
}