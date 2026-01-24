package Day17;

public class Number_of_Sub_arrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int numOfSubarrays(int[] arr, int k, int th) {
	        int c=0;
	        int sum =0;
	        int avg=0;
	        for(int i=0;i<k;i++){
	            sum = sum+arr[i];
	        }
	        avg= sum/k;
	        if(avg>=th){
	            c++;
	        }
	        for(int i=k;i<arr.length;i++){
	            sum= sum+arr[i];
	            sum= sum- arr[i-k];
	            avg= sum/k;
	            if(avg>=th){
	                c++;
	            }
	        }
	        return c;
	    }

}
