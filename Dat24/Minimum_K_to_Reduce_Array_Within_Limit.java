package Dat24;

public class Minimum_K_to_Reduce_Array_Within_Limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int minimumK(int[] nums) {
        int l=1;
        int h= 100000;
        int ans= h;
        while(l<=h){
            int mid= l+(h-l)/2;
            if(isPossible(nums, mid)){
                ans= mid;
                h= mid-1;
            }else{
                l= mid+1;
            }
        }
        return ans;
    }

    boolean isPossible(int[] arr, int mid){
        long c=0;
        long max= (long)mid*mid;
        for(int i=0;i<arr.length;i++){
            c= c+((arr[i]+mid-1)/mid);

            if(c>max){
                return false;
            }
        }
        return c<=max;
        
    }
}
