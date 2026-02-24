package Day47;

public class Check_If_String_Contains_All_Binary_Codes_of_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public boolean hasAllCodes(String s, int k) {
	        Set<String> set= new HashSet<>();
	        int c= (int)Math.pow(2, k);
	        for(int i=k;i<=s.length();i++){
	            String str= s.substring(i-k, i);
	            set.add(str);
	            if(set.size()==c){
	                return true;
	            }
	        }

	        return set.size()==c;
	    }
}
