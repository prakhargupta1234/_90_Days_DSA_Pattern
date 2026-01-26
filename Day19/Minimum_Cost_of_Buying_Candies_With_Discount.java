package Day19;

public class Minimum_Cost_of_Buying_Candies_With_Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int minimumCost(int[] arr) {
	        int total=0;
	        Arrays.sort(arr);
	        int c=0;
	        for(int i= arr.length-1;i>=0;i--){
	            if(c==2){
	                c=0;
	              continue;
	            }
	            total+= arr[i];
	            c++;
	        }
	        return total;

	    }
}
