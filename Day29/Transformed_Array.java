package Day29;

public class Transformed_Array {

	
	public static void main(String[] args) {
		
	}
	
	public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(num<0){
                int idx= (i+num)%n;
                if(idx<0){
                    idx= idx+n;
                }
                ans[i]= nums[idx];

            }else if(num>0){
                int idx= (i+num)%n;
                ans[i]= nums[idx];

            }else {
                ans [i]=nums[i];
            }
        }   

        return ans;
    }
}
