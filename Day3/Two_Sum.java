package Day3;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();   
	        for(int i =0;i<nums.length;i++){
	            int require = target - nums[i];
	            if(map.containsKey(require)){
	                return new int[]{map.get(require), i};
	            }
	            map.put(nums[i], i);
	        }
	        return new int[]{-1, -1};
	    }

}
