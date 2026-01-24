package Day17;

public class Frequency_of_the_Most_Frequent_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int maxFrequency(int[] nums, int k) {
        int ans=0;
        int i=0;
        int j=0;
        long sum =0;
        int n = nums.length;
        Arrays.sort(nums);
        while(i<n){
            sum= sum+nums[i];
            while(((long)nums[i]*(i-j+1)-sum)>k&&j<=i){
                sum=sum- nums[j];
                j++;
            }
            ans= Math.max(ans, i-j+1);
            i++;
        }

        return ans;
    }
}
