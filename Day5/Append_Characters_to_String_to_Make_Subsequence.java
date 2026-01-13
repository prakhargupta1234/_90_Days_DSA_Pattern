package Day5;

public class Append_Characters_to_String_to_Make_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int appendCharacters(String s, String t) {
	        int n = s.length();
	        int m= t.length();
	        if(n==0){
	            return m;
	        }

	        int i=0;
	        int j=0;
	        while(i<n&& j<m){
	            if(s.charAt(i)== t.charAt(j)){
	                j++;
	            }
	            i++;
	        }

	        return m-j;
	    }
}
