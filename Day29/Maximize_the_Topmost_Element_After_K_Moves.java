package Day29;

public class Maximize_the_Topmost_Element_After_K_Moves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int maximumTop(int[] nums, int k) {
	        int n = nums.length;
	        if(k==0){
	            return nums[0];
	        }
	        if(n==1){
	            return (k % 2 == 0) ? nums[0] : -1;
	        }

	        if(k==1){
	            return n==1?-1:nums[1];
	        }
	       int max=-1;
	       for(int i=0;i<Math.min(nums.length,k-1);i++){
	        max= Math.max(max, nums[i]);
	       }
	       if(k<n){
	        max= Math.max(max, nums[k]);
	       }
	       return max; 
	    }

}
