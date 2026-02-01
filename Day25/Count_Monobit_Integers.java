package Day25;

public class Count_Monobit_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int countMonobit(int n) {
	        int c=1;
	        for(int i=1;i<=n;i++){
	            String str = Integer.toBinaryString(i);
	            if(isBinary(str)){
	                c++;
	            }
	        }
	        return c;
	    }
	    boolean isBinary(String s){
	        for(int i=1;i<s.length();i++){
	            if(s.charAt(i)!= (s.charAt(0))){
	                return false;
	            }
	        }
	        return true;
	    }
}
