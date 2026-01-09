package Day2;

public class Squares_of_a_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans= new int[n];
        int i=0;
        int j=n-1;
        int idx= n-1;
        while(i<=j){
            int val1=nums[i]*nums[i]; 
            int val2=nums[j]*nums[j];
            if(val1<val2){
                ans[idx--]= val2;
                j--;
            } else{
                ans[idx--]= val1;
                i++;
            }
        }
        return ans;
    }
}
