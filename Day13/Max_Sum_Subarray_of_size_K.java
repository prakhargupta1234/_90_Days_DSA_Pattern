package Day13;

public class Max_Sum_Subarray_of_size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int maxSubarraySum(int[] arr, int k) {
	        // Code here
	        int sum =0;
	        for(int i=0;i<k;i++){
	            sum= sum+arr[i];
	        }
	        int ans= sum;
	        for(int i=k;i<arr.length;i++){
	            sum+= arr[i];
	            sum-=arr[i-k];
	            ans= Math.max(ans, sum);
	        }
	        
	        return ans;
	    }
}
