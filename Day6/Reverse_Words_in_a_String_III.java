package Day6;

public class Reverse_Words_in_a_String_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public String reverseWords(String s) {
	        if(s.length()==0|| s.length()==1){
	            return s;
	        }
	        String [] arr=s.split(" ");
	        String  ans="";
	        for(int i=0;i<arr.length;i++){
	            String str= reverse(arr[i]);
	            ans= ans+str+" ";
	        }
	        return ans.trim();
	    }

	    String reverse(String s){
	        int i=0;
	        int j = s.length()-1;
	        char[] arr= s.toCharArray();
	        while(i<j){
	            char ch= arr[i];
	            arr[i]= arr[j];
	            arr[j]= ch;
	            i++;
	            j--;
	        }

	        return new String(arr);
	    }
}
