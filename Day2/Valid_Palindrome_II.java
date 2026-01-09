package Day2;

public class Valid_Palindrome_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public boolean validPalindrome(String s) {
	        int i=0;
	        int j= s.length()-1;
	        while(i<j){
	            if(s.charAt(i)!= s.charAt(j)){
	                return Palindrome(i+1, j, s)|| Palindrome(i, j-1, s);
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }

	    boolean Palindrome(int i, int j, String s){
	        while(i<j){
	            if(s.charAt(i)!= s.charAt(j)){
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
}
