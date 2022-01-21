class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
            int stations=gas.length;
            int start=0;
            int currgas=0;
            int end=0;
            int transitions=0;
            int travelled=0;
            currgas=gas[start];
            while(start<=stations){
                    if(currgas<cost[start]){
                            start++;
                            end=start;
                            if(start==stations){
                                    return -1;
                            }
                            else{
                                    currgas=gas[start];
                            }
                            
                            transitions=0;
                            if(travelled>=stations){
                                    return -1;
                            }
                            else{
                                    travelled++;
                            }
                    }
                    else if(currgas>=cost[start]){
                            int newstart=(start+1)%stations;
                            currgas=currgas-cost[start]+gas[newstart];
                            start=newstart;
                            transitions++;
                            travelled++;
                    }
                    if(transitions==stations){
                            if(start==end){
                                    return start;
                            }
                            else{
                                    return -1;
                            }
                    }
                    else if(currgas==0){
                            continue;
                    }
            }
            return -1;
        
    }
}