class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int ans = 0;
        for(int[] bt: boxTypes){
            int boxes = bt[0];
            int units = bt[1];
            if(boxes > truckSize){
                ans+= truckSize * units;
                break;
            }
            ans += boxes*units;
            truckSize -= boxes;
        }
        return ans;
    }
}