class Solution {
    public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int n=people.length;
            int i=0;
            int j=n-1;
            int boats=0;
            while(i<j){
                    if(people[i]+people[j]<=limit){
                            boats++;
                            i++;
                            j--;
                    }
                    else{
                            int firstdiff=limit-people[i];
                            int seconddiff=limit-people[j];
                            if(firstdiff<=seconddiff){
                                    i++;
                                    boats++;
                            }
                            else{
                                    boats++;
                                    j--;
                            }
                    }
            }
            return i==j?boats+1:boats;
        
    }
}