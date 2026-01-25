package Day18;

public class Longer_Contiguous_Segments_of_Ones_than_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public boolean checkZeroOnes(String s) {
	        int zero= Max(s, '0');
	        int one= Max(s, '1');
	        return one>zero;
	    }
	    int Max(String s, char ch){
	        int max=0;
	        int  curr=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)==ch){
	                curr++;
	            }else{
	                max=Math.max(max, curr);
	                curr=0;
	            }
	        }

	        max=Math.max(max, curr);
	        return max;
	    }
}
