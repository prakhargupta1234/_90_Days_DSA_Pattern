package Day3;

public class Two_Sum_II_Input_Array_Is_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int[] twoSum(int[] nums, int target) {
	        int i=0;
	        int j=nums.length-1;
	        while(i<j){
	            int sum = nums[i]+nums[j];
	            if(sum==target){
	                return new int[]{i+1, j+1};
	            }else if(sum<target){
	                i++;
	            }else{
	                j--;
	            }
	        }
	        return new  int[]{-1, -1};
	    }
}
