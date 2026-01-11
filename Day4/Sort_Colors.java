package Day4;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void sortColors(int[] nums) {
        int i=0;
        int j= nums.length-1;
        int k=0;
        while(k<=j){
            if(nums[k]==1){
                k++;
            }else if(nums[k]==2){
                int temp= nums[k];
                nums[k]= nums[j];
                nums[j]= temp;
                j--;    
            }else{
                int temp= nums[k];
                nums[k]= nums[i];
                nums[i]= temp;
                i++;
                k++;
            }
        }
    }

}
