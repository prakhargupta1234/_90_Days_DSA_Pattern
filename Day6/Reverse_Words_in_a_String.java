package Day6;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public String reverseWords(String s) {
	        int l=0;
	        int h=s.length()-1;
	        int n = s.length();
	        while(l<n){
	            if(s.charAt(l)==' '){
	                l++;
	            }else{
	                break;
	            }
	        } 

	         while(h>=0){
	            if(s.charAt(h)==' '){
	                h--;
	            }else{
	                break;
	            }
	        } 

	        StringBuilder sb= new StringBuilder();
	        boolean sp= false;
	        while(l<=h){
	            if(s.charAt(l)!=' '){
	                sb.append(s.charAt(l));
	                l++;
	                sp= false;
	            }else{
	                if(!sp){
	                    sb.append(s.charAt(l));
	                    l++;
	                    sp= true;
	                }else{
	                    l++;
	                }
	            }
	        }

	        int i= 0;
	        int j=sb.length()-1;
	        while(i<j){
	            char temp= sb.charAt(i);
	            sb.setCharAt(i,sb.charAt(j));
	            sb.setCharAt(j, temp);
	            i++;
	            j--;
	        }

	        int st=0;
	        int e=0;
	        for(int k=0;k<sb.length();k++){
	            if(sb.charAt(k)==' '){
	                reverse(st,k-1,sb);   
	                st= k+1;
	            }
	        }
	        reverse(st, sb.length() - 1, sb);
	        return sb.toString();

	    }
	    void reverse (int i, int j,StringBuilder sb ){
	         while(i<j){
	            char temp= sb.charAt(i);
	            sb.setCharAt(i,sb.charAt(j));
	            sb.setCharAt(j, temp);
	            i++;
	            j--;
	        }
	    }
}
