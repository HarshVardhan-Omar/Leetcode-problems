import java.util.Arrays;
class Solution {
	public int lastStoneWeight(int[] stones) {
		if (stones == null) return 0;

		for(int i = stones.length-1; i >= 0 ; i--)
		{
			if(i != 0){
				Arrays.sort(stones);
				stones[i-1] =  stones[i] - stones[i-1];
			}else{
				return stones[i];
			}
		}      
		return 0;         
	}
}