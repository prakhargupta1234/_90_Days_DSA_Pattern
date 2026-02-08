package Day32;

public class Count_Dominant_Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int dominantIndices(int[] nums) {
        int c=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            int cut=0;
            for(int j=i+1;j<n;j++){
                cut++;
                sum= sum+nums[j];
            }
            double avg= (double)sum/cut;
            if(nums[i]>avg){
                c++;
            }
        }
        return c;
    }

}
