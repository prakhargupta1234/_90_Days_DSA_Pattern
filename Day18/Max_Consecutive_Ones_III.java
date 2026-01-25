package Day18;

public class Max_Consecutive_Ones_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int longestOnes(int[] nums, int k) {
	        int max=0;
	        int i=0;
	        int j=0;
	        int n = nums.length;
	        int flip=0;
	        while(i<n){
	            if(nums[i]==0){
	                flip++;
	            }

	            while(flip>k&&j<=i){
	                if(nums[j]==0){
	                    flip--;
	                }
	                j++;
	            }
	            max= Math.max(max, i-j+1);
	            i++;
	        }

	        return max;

	    }
}
