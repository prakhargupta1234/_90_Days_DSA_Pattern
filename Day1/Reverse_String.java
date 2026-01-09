package Day1;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public void reverseString(char[] s) {
	        int n = s.length;
	        int i=0;
	        int j= n-1;
	        while(i<j){
	            char ch= s[i];
	            s[i]= s[j];
	            s[j]= ch;
	            i++;
	            j--;
	        }
	    }
}
