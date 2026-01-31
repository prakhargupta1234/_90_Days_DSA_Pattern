package Dat24;

public class Reverse_Letters_Then_Special_Characters_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public String reverseByType(String s) {
	        List<Character> ch= new ArrayList<>();
	        List<Character> sp= new ArrayList<>();
	        for(char c:s.toCharArray()){
	            if(Character.isLowerCase(c)){
	                ch.add(c);
	            }else{
	                sp.add(c);
	            }
	        }
	        Collections.reverse(ch);
	        Collections.reverse(sp);
	        StringBuilder sb= new StringBuilder();
	        int i=0;
	        int j=0;
	        for(char c:s.toCharArray()){
	            if(Character.isLowerCase(c)){
	                sb.append(ch.get(i++));
	            }else{
	                sb.append(sp.get(j++));
	            }
	        }

	        return sb.toString();
	        
	    }
}
