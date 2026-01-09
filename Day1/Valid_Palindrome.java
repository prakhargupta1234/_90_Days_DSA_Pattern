package Day1;

public class Valid_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isPalindrome(String s) {
	        int i= 0;
	        int j= s.length()-1;
	        while(i<j){
	            char ch1= s.charAt(i);
	            char ch2= s.charAt(j);
	            if(Character.isLetterOrDigit(ch1)&&Character.isLetterOrDigit(ch2)){
	                ch1=Character.toLowerCase(ch1);
	                ch2=Character.toLowerCase(ch2);
	                if(ch1==ch2){
	                    i++;
	                    j--;
	                }else{
	                    return false;
	                }
	            }else if(!Character.isLetterOrDigit(ch1)){
	                i++;
	            }else if(!Character.isLetterOrDigit(ch2)){
	                j--;
	            }
	        }
	        return true;
	    }

}
