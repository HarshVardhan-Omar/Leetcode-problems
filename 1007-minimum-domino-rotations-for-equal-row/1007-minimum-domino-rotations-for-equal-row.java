class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
            int ans1=converttotarget(tops,bottoms,tops[0]);
            int ans2=converttotarget(tops,bottoms,bottoms[0]);
            if(ans1>0&&ans2>0){
                    return Math.min(ans1,ans2);
            }
            else if(ans1>0)return ans1;
            else return ans2;
        
    }
        private int converttotarget(int[] tops,int[] bottoms,int target){
                int topmoves=0;
                int bottommoves=0;
                for(int i=0;i<tops.length;i++){
                        if(tops[i]!=target&&bottoms[i]!=target){
                                return -1;
                        }
                        else if(tops[i]!=target&&bottoms[i]==target){
                                topmoves++;
                        }
                        else if(bottoms[i]!=target&&tops[i]==target){
                                bottommoves++;
                        }
                        
                }
                return Math.min(topmoves,bottommoves);
                
                
        }
}