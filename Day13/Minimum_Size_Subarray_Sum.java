package Day13;

public class Minimum_Size_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int minSubArrayLen(int target, int[] nums) {
	        int sum=0;
	        int ans=Integer.MAX_VALUE;
	        int si=0;
	        int ei=0;
	        int n = nums.length;
	        while(ei<n){
	            sum= sum+nums[ei];
	            while(sum>=target&&si<=ei){
	                ans= Math.min(ans, ei-si+1);
	                sum-= nums[si];
	                si++;
	            }
	            ei++;
	            
	        }
	        return ans ==Integer.MAX_VALUE?0:ans;
	    }
}
