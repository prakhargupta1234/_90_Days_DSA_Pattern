package Day46;

public class Check_Digitorial_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public boolean isDigitorialPermutation(int n) {
	        int[] fact= {1,1,2,6,24,120,720,5040,40320,362880};
	        int temp= n;
	         String s1=n+"";
	        int factsum=0;
	        int []org= new int[10];
	       for(char ch:s1.toCharArray()){
	            int  rem= ch-'0';
	            factsum+= fact[rem];
	            org[rem]++;
	        }

	       
	        String s2= factsum+"";
	        if(s1.length()!= s2.length()){
	            return false;
	        }
	        int []org2= new int [10];
	        for(char ch: s2.toCharArray()){
	            org2[ch-'0']++;
	        }

	        return Arrays.equals(org, org2);
	    }
}
