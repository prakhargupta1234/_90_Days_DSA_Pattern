package Day46;

public class Binary_Gap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int binaryGap(int n) {
	        int prev=-1;
	        int curr=0;
	        int ans= 0;
	        if(n<2){
	            return ans;
	        }
	        while(n>0){
	            if((n&1)==1){
	                if(prev!= -1){
	                ans= Math.max(ans, curr- prev);
	                }
	                prev= curr;
	            }
	            curr++;
	            n= n/2;
	        }
	        

	        return ans;

	    }

}
