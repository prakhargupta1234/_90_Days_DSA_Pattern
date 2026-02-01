package Day25;

public class Divide_an_Array_Into_Subarrays_With_Minimum_Cost_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int minimumCost(int[] nums) {
	        int min1= Integer.MAX_VALUE;
	        int min2=Integer.MAX_VALUE;
	        int idx= -1;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]<min1){
	                min1=  nums[i];
	                idx=i;
	            }
	        }
	        for(int i=1;i<nums.length;i++){
	            if(i!= idx){
	                min2= Math.min(min2, nums[i]);
	            }
	        }

	        return min1+min2+nums[0];
	      
	    }

}
