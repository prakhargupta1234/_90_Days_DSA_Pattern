package Dat14;

public class Contains_Duplicate_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public boolean containsNearbyDuplicate(int[] nums, int k) {
	        if(k<=0){
	            return false;
	        }
	        Map<Integer, Integer> map= new HashMap<>();
	        for(int i=0;i<k;i++){
	            if(!map.containsKey(nums[i])){
	                map.put(nums[i], 1);
	            }else{
	                return true;
	            }
	        }

	        for(int i=k;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                return true;
	            }
	            map.remove(nums[i-k]);
	            map.put(nums[i], 1);
	        }

	        return false;
	    }
}
