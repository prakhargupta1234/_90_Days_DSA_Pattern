package Day25;

public class Final_Element_After_Subarra_Deletions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int finalElement(int[] nums) {
        int n= nums.length;
        if(n==1){
            return nums[0];
        }

        return Math.max(nums[0], nums[n-1]);
    }

}


